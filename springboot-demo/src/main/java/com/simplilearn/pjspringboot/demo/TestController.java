package com.simplilearn.pjspringboot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/kuku")
	public String t() {
		return "hello t, I am well...";
	}
}
