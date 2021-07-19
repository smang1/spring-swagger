package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //do not put it in the root class for real world application
public class SpringbootSwagger2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwagger2Application.class,args);
    }
}
