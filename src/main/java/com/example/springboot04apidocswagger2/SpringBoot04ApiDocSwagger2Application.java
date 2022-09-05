package com.example.springboot04apidocswagger2;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
//@Api(value = "My PET API Document")
public class SpringBoot04ApiDocSwagger2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringBoot04ApiDocSwagger2Application.class, args);
    }

}
