package com.wuyingsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@Configuration
@RequestMapping("/ServiceB/user")
public class ServiceBController {

//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
//		return new RestTemplate();
//	}
//
//	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
//	public String greeting(@PathVariable("name") String name) {
//		RestTemplate restTemplate = getRestTemplate();
//		return restTemplate.getForObject("http://ServiceA/sayHello/" + name, String.class);
//	}

//	@Autowired
//	private IServiceA serviceA;
//
//	@RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
//	public String greeting(@PathVariable("name") String name) {
//		return serviceA.sayHello(name);
//	}
	@Autowired
	private ServiceAClient serviceA;

	@RequestMapping(value = "/sayHello/{id}",method = RequestMethod.GET)
	public String greeting(@PathVariable("id") Long id,
						   @RequestParam("name") String name,
						   @RequestParam("age") Integer age){
		return serviceA.sayHello(id,name,age);
	}
}
