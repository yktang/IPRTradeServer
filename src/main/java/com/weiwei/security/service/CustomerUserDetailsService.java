package com.weiwei.security.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.weiwei.dao.UserDao;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

	Logger logger = LogManager.getLogger(CustomerUserDetailsService.class);

	@Autowired
	private UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.trace("loadUserByUsername(String username), Username: {}", () -> username);
		return userDao.findCustomerByUsername(username);
	}

}
