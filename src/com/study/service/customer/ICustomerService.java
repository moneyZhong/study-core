package com.study.service.customer;

import com.study.entity.customer.Customer;

public interface ICustomerService {
	Customer getByPrimaryKey(Long id);
}
