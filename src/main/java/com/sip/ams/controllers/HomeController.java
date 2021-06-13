package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String home()
	{
		return "<h2>Bienvenue au BootCamp</h2>";
	}

}
