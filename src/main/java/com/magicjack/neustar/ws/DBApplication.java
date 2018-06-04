package com.magicjack.neustar.ws;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;

import com.magicjack.webservice.iristel.config.BatchConfiguration;
import com.magicjack.webservice.iristel.config.DatabaseUtility;

@SpringBootApplication
@PropertySource("config.properties")
@ComponentScan(basePackages = { "com.magicjack.webservice" }, excludeFilters = {
        @ComponentScan.Filter(type=FilterType.ASSIGNABLE_TYPE, classes= {BatchRunner.class, BatchConfiguration.class})})
@MapperScan("com.magicjack.webservice.iristel.dao.mapper")
public class DBApplication {
    
    private static Logger logger = LoggerFactory.getLogger(DBApplication.class);
    
    public static void main(String[] args) {

        try (ConfigurableApplicationContext ctx = SpringApplication.run(DBApplication.class, args)) {
            ctx.getBean(DatabaseUtility.class).run(args);
        }

        for (Thread t : Thread.getAllStackTraces().keySet()) {
            //if (t.getState() == Thread.State.RUNNABLE) {
                logger.debug("Running thread: {}, daemon: {}, alive: {}", t, t.isDaemon(), t.isAlive());
                if(t.getPriority() == 4) {
                    t.interrupt();
                }
            //}
        }
        //System.exit(1);
    }
}
