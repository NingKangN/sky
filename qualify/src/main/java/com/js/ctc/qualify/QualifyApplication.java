package com.js.ctc.qualify;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.js.ctc.qualify.mapper.**")
public class QualifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(QualifyApplication.class, args);
    }

}
