package com.mvillalba.springboot.banckend.apirest.springbootbackendapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class SpringBootBackendApirestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBackendApirestApplication.class, args);
    }

}
