package com.qz.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.qz.sm.config.YmlConfiger;

/* 参考
* wx.login(Object object) https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/wx.login.html
* code2Session https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/code2Session.html
* urlRootPath=https://api.weixin.qq.com/sns/jscode2session 微信接口服务器地址,获取用户唯一标识openid
* js_code=code 小程序调用wx.login得到code，再传入至此
* appid = yourAppId AppID(小程序ID)
* secret = yourAppSecret AppSecret(小程序密钥)
* grant_type = authorization_code 此接口固定值
*/

@Api(value = "Drcsy-ApiController-Doc", tags = "微信小程序专用接口")
@RestController
@RequestMapping(value = "/wxapp")
public class WxappController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private YmlConfiger ymlConfiger;

	@ApiOperation("获取小程序登录接口的用户凭证code")
	@GetMapping(value = "/login/{code}")
	public String wxLogin(@PathVariable String code) {
		String appid = ymlConfiger.getAppid();
		String secret = ymlConfiger.getSecret();
		String urlRootPath = "https://api.weixin.qq.com/sns/jscode2session";
		String url = urlRootPath + "?appid=" + appid + "&secret=" + secret + "&grant_type=authorization_code&js_code="
				+ code;
		System.out.println(url);
		String res = restTemplate.getForEntity(url, String.class).getBody();
		System.out.println(res);

		return res;
	}
}
