package com.study.service.impl.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.dao.customer.CustomerDao;
import com.study.entity.customer.Customer;
import com.study.service.customer.ICustomerService;
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	private CustomerDao customerDao;
	@Override
	public Customer getByPrimaryKey(Long id) {
		return customerDao.selectByPrimaryKey(id);
	}
}
