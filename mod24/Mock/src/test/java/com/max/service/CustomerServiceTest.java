package com.max.service;

import com.max.dao.CustomerDao;
import com.max.dao.CustomerDaoMock;
import com.max.dao.ICustomerDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceTest {

    @Test
    void save() {
        ICustomerDao mokDao = new CustomerDaoMock();
        CustomerService service = new CustomerService(mokDao);
        String response  = service.save();

        Assertions.assertEquals("Success",response);

    }

    @Test
    void exceptionWhileSaving() {
        ICustomerDao mokDao = new CustomerDao();
        CustomerService service = new CustomerService(mokDao);
        try{
            String response  = service.save();
        }catch (Exception ex){
            Assertions.assertEquals(UnsupportedOperationException.class, ex.getClass());
        }
    }
}