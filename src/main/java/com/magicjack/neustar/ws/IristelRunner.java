package com.magicjack.neustar.ws;

import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.magicjack.webservice.iristel.processor.CreatePonProcessor;

@SpringBootApplication
@PropertySource("config.properties")
public class IristelRunner {

    private final Timer timer = new Timer();
    
    @Autowired
    private CreatePonProcessor processor;
    
    @Value("${iristel.create.pons.delay.ms}")
    private long delay = 5000L;
    
    @Value("${iristel.create.pons.interval.ms}")
    private long interval = 120000L;
    
    private static Logger logger = LoggerFactory.getLogger(IristelRunner.class);
   
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(IristelRunner.class, args);
        ctx.getBean(IristelRunner.class).run();
    }
    
    public void run() {
        timer.scheduleAtFixedRate(processor.getReadThread(), delay, interval);
        Runtime.getRuntime().addShutdownHook(new Thread(this::shutdownHook, "ShutdownHook"));
        //System.exit(0);
    }
    
    public void shutdownHook() {
        logger.info("Shutting down IristelRunner ...");
    }
    
    
}
