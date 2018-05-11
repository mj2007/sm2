package com.test.tools;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ITPController {
	@RequestMapping("/about")
	public String hello()
	{
		return "WELCOME TO ACC !";
	}


}
