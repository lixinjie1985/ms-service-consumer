package com.sc.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sc.ms.bean.User;

/**
 * @author lixinjie
 * @since 2018-07-16
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/user")
	public User getUser() {
		return restTemplate.getForObject("http://ms-service-provider/provider/user", User.class);
	}
}
