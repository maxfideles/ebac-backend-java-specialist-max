package com.max.dao;

import com.max.Customer;

public class CustomerDao implements ICustomerDao {
    @Override
    public String save(Customer customer) {
        return "Saved!";
    }

    @Override
    public String findCustomerByCpf(String s) {
        return "Max";
    }

    @Override
    public String deleteCustomerByCpf(String cpf) {
        return "Success!";
    }

    @Override
    public String update(Customer customer) {
        return customer.getName();
    }
}
