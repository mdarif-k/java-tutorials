package com.way2p.developer.sprintbootwebandthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}

}
