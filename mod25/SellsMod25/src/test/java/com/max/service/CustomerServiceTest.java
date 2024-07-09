package com.max.service;

import com.max.Customer;
import com.max.dao.CustomerDao;
import com.max.dao.CustomerDaoMock;
import com.max.dao.ICustomerDao;
import com.max.service.CustomerService;
import com.max.service.ICustomerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerServiceTest {

    private final static String NAME = "Max";
    private final static String CPF = "123.456.789-10";
    private final static Long TEL = 992128976L;
    private final static String ADDRESS = "Lexham Gardens";
    private final static Integer NUMBER = 57;
    private final static String CITY = "London";
    private final static String STATE = "England";
    Customer customer;
    ICustomerService customerService;
    ICustomerDao customerDao;



    @BeforeEach
    public void setup(){
        this.initiateCustomer();

    }
    @Test
    public void saveCustomerTest(){
        customerDao = new CustomerDao();
        customerService = new CustomerService(customerDao);
        Assertions.assertEquals("Saved!",customerService.saveCustomer(customer));
    }
    @Test
    public void saveCustomerException(){
        customerDao = new CustomerDaoMock();
        customerService = new CustomerService(customerDao);
        Assertions.assertEquals("Failed!",customerService.saveCustomer(customer));
    }
    @Test
    public void searchCustomer(){
        customerDao = new CustomerDao();
        customerService = new CustomerService(customerDao);
        String response = customerService.findCustomerByCpf(customer.getCpf());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(NAME,response);
    }

    @Test
    public void searchCustomerException(){
        customerDao = new CustomerDaoMock();
        customerService = new CustomerService(customerDao);

        try{
            String response= customerService.findCustomerByCpf(customer.getCpf());

        }catch (Exception ex){
            Assertions.assertEquals(NullPointerException.class,ex.getClass());
        }
    }

    @Test
    public void deleteCustomer(){
        customerDao = new CustomerDao();
        customerService = new CustomerService(customerDao);
        String response = customerService.delete(customer.getCpf());

        Assertions.assertEquals("Success!",response);
    }

    @Test
    public void deleteCustomerException(){
        customerDao = new CustomerDaoMock();
        customerService = new CustomerService(customerDao);

        try{
            String response= customerService.delete(customer.getCpf());

        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
            Assertions.assertEquals("Does not exist a customer with this cpf!",ex.getMessage());
        }
    }

    @Test
    void updateCustomer(){
        customerDao = new CustomerDao();
        customerService = new CustomerService(customerDao);
        customer.setName("Victor");
        String response = customerService.updateCustomer(customer);

        Assertions.assertEquals("Victor",response);
    }

    @Test
    void updateCustomerException(){
        customerDao = new CustomerDaoMock();
        customerService = new CustomerService(customerDao);
        customer.setName("Victor");
        try{
            String response = customerService.updateCustomer(customer);
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class,ex.getClass());
            Assertions.assertEquals("This customer can not be updated!",ex.getMessage());
        }
    }

    public void initiateCustomer(){
         customer = new Customer(NAME, CPF, TEL, ADDRESS, NUMBER, CITY, STATE);
    }

}
