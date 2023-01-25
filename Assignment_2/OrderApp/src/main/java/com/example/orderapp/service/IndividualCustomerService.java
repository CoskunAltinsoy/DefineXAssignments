package com.example.orderapp.service;

import com.example.orderapp.model.IndividualCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IndividualCustomerService {
    private final List<IndividualCustomer> individualCustomers;
    public IndividualCustomerService(List<IndividualCustomer> individualCustomers) {
        this.individualCustomers = individualCustomers;
    }
    public List<IndividualCustomer> getAllIndividualCustomers(){
        return this.individualCustomers.stream().map(x->x).collect(Collectors.toList());
    }

    public List<IndividualCustomer> getIndividualCustomersById(Long id){
        return this.individualCustomers.stream().filter(x->x.getId()==id).collect(Collectors.toList());
    }

    public void createIndividualCustomer(IndividualCustomer customer){
        this.individualCustomers.add(customer);
    }

    public List<IndividualCustomer> getIndividualCustomersWithC() {
        List<IndividualCustomer> customers = new ArrayList<>();
        for (IndividualCustomer customer:this.individualCustomers) {
            if (customer.getFirstName().toLowerCase().contains("c")){
                customers.add(customer);
            }
        }
        return  customers;
    }
}
