package com.magicjack.neustar.ws;

import javax.annotation.PreDestroy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude= {JacksonAutoConfiguration.class, JmxAutoConfiguration.class, WebSocketServletAutoConfiguration.class})
@PropertySource("config.properties")
@ComponentScan({"com.magicjack.webservice.iristel"})
@MapperScan("com.magicjack.webservice.iristel.dao.mapper")
public class BatchApplication {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = SpringApplication.run(BatchApplication.class, args);
        
        //System.exit(SpringApplication.exit(ctx, ()->0));
        //ctx.close();
    }
    
    
    @Component
    class TerminateBean {
        @PreDestroy
        public void onDestroy() throws Exception {
            System.out.println("Spring Container is destroyed!");
        }
    }
}
