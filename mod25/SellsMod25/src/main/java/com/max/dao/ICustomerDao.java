package com.max.dao;

import com.max.Customer;

public interface ICustomerDao {
    String save(Customer customer);

    String findCustomerByCpf(String s);

    String deleteCustomerByCpf(String cpf);

    String update(Customer customer);
}
