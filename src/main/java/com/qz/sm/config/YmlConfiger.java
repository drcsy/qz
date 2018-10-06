package com.qz.sm.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "my-param.wxapp")
@Data
public class YmlConfiger {
	private String appid;
	private String secret;
}
