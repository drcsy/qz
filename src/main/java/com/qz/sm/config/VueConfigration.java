package com.qz.sm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class VueConfigration implements WebMvcConfigurer{
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(
//				"file:D:/dev/vue/vuetarget/",
				"classpath:/META-INF/resources/",
				"classpath:/resources/",
				"classpath:/static/",
				"classpath:/public/"
				);
//		super.addResourceHandlers(registry);
	}

}
