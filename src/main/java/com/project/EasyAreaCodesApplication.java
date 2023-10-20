package com.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@MapperScan("com.project.mapper")
@EnableOpenApi
@SpringBootApplication
public class EasyAreaCodesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyAreaCodesApplication.class, args);
    }

}
