package com.qz.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.qz.sm.dao")
@EnableSwagger2
public class QzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QzApplication.class, args);
	}
}
