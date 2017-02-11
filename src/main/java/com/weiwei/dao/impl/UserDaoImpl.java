package com.weiwei.dao.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.weiwei.dao.UserDao;
import com.weiwei.vo.Customer;

@Service
public class UserDaoImpl implements UserDao {

	Logger logger = LogManager.getLogger(UserDaoImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(final Customer customer) {
		logger.info("create customer {}", customer.getUsername());
		String sql = "insert into customer (username, password, phone, email) values (?, ?, ?, ?)";
		jdbcTemplate.update(sql, new Object[] { customer.getUsername(), customer.getPassword(), customer.getPhone(),
				customer.getEmail() });
	}

	@Override
	@Transactional(readOnly = true)
	public Customer findCustomerByUsername(String username) {
		String sql = "select * from customer where username = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { username },
				new BeanPropertyRowMapper<Customer>(Customer.class));
	}

}
