package com.max.service;

import com.max.Customer;

public interface ICustomerService {
    String saveCustomer(Customer customer);

    String findCustomerByCpf(String s);

    String delete(String cpf);

    String updateCustomer(Customer customer);
}
