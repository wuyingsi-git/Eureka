package com.wuyingsi.service;

import com.wuyingsi.api.ServiceAInterface;
import org.springframework.web.bind.annotation.*;

@RestController
public class ServiceAController implements ServiceAInterface {
//	@RequestMapping(value = "/sayHello/{name}",
//			method = RequestMethod.GET)
//	public String sayHello(@PathVariable("name") String name) {
//		return "{'msg': 'hello, " + name + "'}";
//	}
	public String sayHello(@PathVariable("id") Long id,
						   @RequestParam("name") String name,
						   @RequestParam("age") Integer age){
		System.out.println("打招呼，id="+id+",name="+name+",age="+age);
		return "{'msg':'hello'"+name+"'}";
	}
}