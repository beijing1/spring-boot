package com.magicjack.neustar.ws;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude= {JacksonAutoConfiguration.class, JmxAutoConfiguration.class, WebSocketServletAutoConfiguration.class})
@PropertySource("config.properties")
@ComponentScan({"com.magicjack.webservice.iristel"})
@MapperScan("com.magicjack.webservice.iristel.dao.mapper")
public class BatchRunner {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(BatchRunner.class, args);
    }
}
