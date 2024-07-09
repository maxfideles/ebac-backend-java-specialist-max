package com.max.dao;

import com.max.Customer;
import com.max.service.CustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDaoTest {

    private final static String NAME = "Max";
    private final static String CPF = "123.456.789-10";
    private final static Long TEL = 992128976L;
    private final static String ADDRESS = "Lexham Gardens";
    private final static Integer NUMBER = 57;
    private final static String CITY = "London";
    private final static String STATE = "England";
    Customer customer;
    ICustomerDao customerDao;

    @BeforeEach
    public void setup(){
        this.initiateCustomer();
    }

    @Test
    void save() {
        customerDao = new CustomerDao();
        Assertions.assertEquals("Saved!",customerDao.save(customer));
    }

    @Test
    public void saveException(){
        customerDao = new CustomerDaoMock();
        Assertions.assertEquals("Failed!",customerDao.save(customer));
    }

    @Test
    void findCustomerByCpf() {
        customerDao = new CustomerDao();
        String response = customerDao.findCustomerByCpf("123.456.789-10");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(NAME,response);
    }

    @Test
    public void searchCustomerException(){
        customerDao = new CustomerDaoMock();

        try{
            String response= customerDao.findCustomerByCpf("123.456.789-10");

        }catch (Exception ex){
            Assertions.assertEquals(NullPointerException.class,ex.getClass());
        }
    }

    @Test
    public void deleteCustomer(){
        customerDao = new CustomerDao();
        String response = customerDao.deleteCustomerByCpf(customer.getCpf());

        Assertions.assertEquals("Success!",response);
    }

    @Test
    public void deleteCustomerException(){
        customerDao = new CustomerDaoMock();

        try{
            String response= customerDao.deleteCustomerByCpf(customer.getCpf());

        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
            Assertions.assertEquals("Does not exist a customer with this cpf!",ex.getMessage());
        }
    }

    @Test
    void updateCustomer(){
        customerDao = new CustomerDao();
        customer.setName("Victor");
        String response = customerDao.update(customer);

        Assertions.assertEquals("Victor",response);
    }

    @Test
    void updateCustomerException(){
        customerDao = new CustomerDaoMock();
        customer.setName("Victor");
        try{
            String response = customerDao.update(customer);
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
            Assertions.assertEquals("This customer can not be updated!",ex.getMessage());
        }
    }

    public void initiateCustomer(){
        customer = new Customer(NAME, CPF, TEL, ADDRESS, NUMBER, CITY, STATE);
    }
}