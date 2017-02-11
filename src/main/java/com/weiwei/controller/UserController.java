package com.weiwei.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weiwei.common.Constants;
import com.weiwei.dao.UserDao;
import com.weiwei.vo.Customer;

@RestController
@RequestMapping(Constants.IPRSEC)
public class UserController {
	
	Logger logger = LogManager.getLogger(UserController.class);
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@RequestBody Customer customer) {
		userDao.create(customer);
		return "success";
	}
}
