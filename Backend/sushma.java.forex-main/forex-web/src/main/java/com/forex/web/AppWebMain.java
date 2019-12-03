package com.forex.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.forex.common.entity")
@EnableJpaRepositories(basePackages = "com.forex.dao")
@ComponentScan(basePackages = {"com.forex.service", "com.forex.web"})
public class AppWebMain 
{
    public static void main( String[] args )
    {
        SpringApplication.run(AppWebMain.class, args);
        System.out.println("Hello, World!");
    }
}
