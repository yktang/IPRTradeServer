package com.weiwei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ipr")
public class HomeController {
	@RequestMapping(value = "sss", method = RequestMethod.GET)
	public String tse() {
		return "hola guy";
	}
}
