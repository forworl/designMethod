package com.example.designmethod;

import com.example.designmethod.chain.AbstractChainContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DesignMethodApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        final ConfigurableApplicationContext context = SpringApplication.run(DesignMethodApplication.class, args);
        System.out.println(context.getBean(AbstractChainContext.class));
    }

}
