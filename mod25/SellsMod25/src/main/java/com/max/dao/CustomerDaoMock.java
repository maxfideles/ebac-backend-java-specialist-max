package com.max.dao;

import com.max.Customer;

public class CustomerDaoMock implements ICustomerDao {
    @Override
    public String save(Customer customer) {
        return "Failed!";
    }

    @Override
    public String findCustomerByCpf(String s) {
        throw new NullPointerException();
    }

    @Override
    public String deleteCustomerByCpf(String cpf) {
        throw new UnsupportedOperationException("Does not exist a customer with this cpf!");
    }

    @Override
    public String update(Customer customer) {
        throw new UnsupportedOperationException("This customer can not be updated!");
    }
}
