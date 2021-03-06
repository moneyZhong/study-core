package com.study.dao.customer;

import com.study.dao.MyBatisDao;
import com.study.entity.customer.Customer;
@MyBatisDao
public interface CustomerDao {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}