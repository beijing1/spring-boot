package com.magicjack.webservice.iristel.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.*;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.explore.support.MapJobExplorerFactoryBean;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.repository.support.MapJobRepositoryFactoryBean;
import org.springframework.batch.item.database.*;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.transaction.PlatformTransactionManager;

import com.magicjack.webservice.iristel.domain.vo.CreatePonsRequest;
import com.magicjack.webservice.iristel.processor.CreatePonsRequestItemProcessor;

import https.LnpCreatePonRequest;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration extends DefaultBatchConfigurer{

    
    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public CreatePonsRequestItemProcessor processor;
    
    @Autowired
    public DataSource dataSource;
    
    @Autowired
    public PlatformTransactionManager transactionManager;
    
    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    // tag::readerwriterprocessor[]
    @Bean
    public JdbcCursorItemReader<CreatePonsRequest> reader() {
        JdbcCursorItemReader<CreatePonsRequest> reader = new JdbcCursorItemReader<>();
        reader.setDataSource(dataSource);
        reader.setSql("select * from msun.create_pons_request where id > 0");
        reader.setRowMapper(new BeanPropertyRowMapper<>(CreatePonsRequest.class));
        return reader;
    }

//    @Bean
//    public CreatePonsRequestItemProcessor processor() {
//        return new CreatePonsRequestItemProcessor();
//    }

    @Bean
    public JdbcBatchItemWriter<LnpCreatePonRequest> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<LnpCreatePonRequest>()
            .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
            .sql("INSERT INTO people (first_name, last_name) VALUES (:firstName, :lastName)")
            .dataSource(dataSource)
            .build();
    }
    // end::readerwriterprocessor[]

    // tag::jobstep[]
    @Bean
    public Job createPonsRequest(/*JobCompletionNotificationListener listener,*/ Step step1) {
        return jobBuilderFactory.get("createPonsRequest")
            .incrementer(new RunIdIncrementer())
            //.listener(listener)
            .flow(step1)
            .end()
            .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<LnpCreatePonRequest> writer) {
        return stepBuilderFactory.get("step1")
            .<CreatePonsRequest, LnpCreatePonRequest> chunk(1)
            .reader(reader())
            .processor(processor)
            //.writer(writer)
            .build();
    }
    // end::jobstep[]
    
//    public JobRepository jobRepository() throws Exception {
//        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
//        factory.setIsolationLevelForCreate(Isolation.REPEATABLE_READ.name());
//        //factory.setDataSource(dataSource());
//        //factory.setTransactionManager(getTransactionManager());
//        factory.afterPropertiesSet();
//        return (JobRepository) factory.getObject();
//    }
    
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        return new ResourcelessTransactionManager();
//    }

    @Bean
    public JobRepository createJobRepository() throws Exception {
        return new MapJobRepositoryFactoryBean(transactionManager).getObject();
    }
    
    protected JobLauncher createJobLauncher() throws Exception {
        SimpleJobLauncher jobLauncher = new SimpleJobLauncher();
        jobLauncher.setJobRepository(createJobRepository());
        jobLauncher.afterPropertiesSet();
        return jobLauncher;
    }

    protected JobExplorer createJobExplorer() throws Exception {
        MapJobExplorerFactoryBean jobExplorerFactory = new MapJobExplorerFactoryBean(new MapJobRepositoryFactoryBean(transactionManager));
        jobExplorerFactory.afterPropertiesSet();
        return jobExplorerFactory.getObject();
    }
}
