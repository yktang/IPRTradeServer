package com.weiwei.dao;

import com.weiwei.vo.Customer;

public interface UserDao {

	void create(final Customer customer);

	Customer findCustomerByUsername(String username);

}
