package com.max.service;

import com.max.dao.CustomerDao;
import com.max.dao.ICustomerDao;

public class CustomerService {

    private ICustomerDao customerDAO;

    public CustomerService(ICustomerDao customerDao){
        this.customerDAO = customerDao;
    }

    public String save(){
        customerDAO.save();
        return "Success";
    }
}
