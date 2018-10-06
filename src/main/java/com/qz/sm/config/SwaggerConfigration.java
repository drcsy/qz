package com.qz.sm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration // 标记配置类
//@EnableSwagger2 //开启在线接口文档
public class SwaggerConfigration {
	/**
	 * 添加摘要信息(Docket)
	 * http://192.168.1.2:8000/swagger-ui.html#/
	 */
	@Bean
	public Docket controllerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(new ApiInfoBuilder()
				.title("AllPacs Management System of Drcsy")
				.description("用于一些运营管理工作")
                .contact(new Contact("Drcsy", "https://www.baidu.com", null )) //"398241665@qq.com"
				.version("版本号:1.0").build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.qz.sm.controller"))
				.paths(PathSelectors.any())
				.build();
	}
}