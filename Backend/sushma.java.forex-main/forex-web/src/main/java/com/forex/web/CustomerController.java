package com.forex.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.forex.common.entity.Customer;
import com.forex.service.BaseService;
import com.forex.service.CustomerService;

@RestController
//@RequestMapping(path = "/api/service/forex-app/customer", produces = "application/json")
public class CustomerController extends BaseController<Customer, Customer>{

	@Autowired
	CustomerService customerService;
	
	@Override
	public BaseService<Customer, Customer> getBaseService() {
		return customerService;
	}
	
	

}
