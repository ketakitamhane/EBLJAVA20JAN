package com.wecp.progressive.dao;
import java.util.*;

import com.wecp.progressive.dto.CustomerAccountInfo;
import com.wecp.progressive.entity.Customers;

public class CustomerDAOImpl {
    int addCustomer(Customers customers){
        return 0;

    }
    Customers getCustomerById(int customerId){
        return new Customers();

    }
    void updateCustomer(Customers customers){


    }
    void deleteCustomer(int customerId){

    }
    List<Customers> getAllCustomers(){
        ArrayList<Customers> arr2 = new ArrayList<>();
        return arr2;

    }
    CustomerAccountInfo getCustomerAccountInfo(int customerId){
        Customer c = new Customer();
        return c;

    }

}
