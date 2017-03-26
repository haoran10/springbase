package wang.conge.springbase.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/map")
	Map<String,String> map(){
		Map<String,String> map = new HashMap<>();
		map.put("Hello", "World");
		
		return map;
	}
}