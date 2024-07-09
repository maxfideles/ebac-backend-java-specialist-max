package com.max.service;

import com.max.Customer;
import com.max.dao.CustomerDao;
import com.max.dao.ICustomerDao;

public class CustomerService implements ICustomerService {

    ICustomerDao customerDao;


    public CustomerService(ICustomerDao customerDao){
        this.customerDao = customerDao;
    }
    @Override
    public String saveCustomer(Customer customer) {

        return customerDao.save(customer);
    }

    @Override
    public String findCustomerByCpf(String s) {
        return customerDao.findCustomerByCpf(s) ;
    }

    @Override
    public String delete(String cpf) {
        return customerDao.deleteCustomerByCpf(cpf);
    }

    @Override
    public String updateCustomer(Customer customer) {
        return customerDao.update(customer);
    }

}
