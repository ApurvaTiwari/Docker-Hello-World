package com.example.HelloWorld;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	public final AtomicLong counter = new AtomicLong(0);
	
	
	@RequestMapping(method=RequestMethod.GET, path="/greeting")
	public Map<String, Object> getGreeting(){
		
		Map<String, Object> response = new HashMap<>();
		
		response.put("count", counter.incrementAndGet());
		
		return response;
	}
	
}
