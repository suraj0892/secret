package com.secrets.manager.springsecretsmanager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

	
	@Value("${spring.data.rest.strapi-url.value}")
	private String value;

	@GetMapping("/getValue")
	public String getValue() {
		return value;
	}
}
