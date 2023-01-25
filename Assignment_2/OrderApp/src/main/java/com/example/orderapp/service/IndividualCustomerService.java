package com.example.orderapp.service;

import com.example.orderapp.model.Bill;
import com.example.orderapp.model.IndividualCustomer;

import java.time.LocalDate;
import java.time.Month;
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
        customer.setCreatedDate(LocalDate.now());
        this.individualCustomers.add(customer);
    }

    public List<IndividualCustomer> getIndividualCustomersWithC() {
        List<IndividualCustomer> customers = new ArrayList<>();
        for (IndividualCustomer customer:this.individualCustomers) {
            if (customer.getFirstName().toLowerCase().contains("c")){
                customers.add(customer);
            }
        }
        return customers;
    }
    public Double getAllPrice(){
        double totalPrice =0;
        for (IndividualCustomer customer: individualCustomers) {
            if (customer.getCreatedDate().getMonth().equals(Month.JUNE)){
                List<Bill> bills = customer.getBills().stream().collect(Collectors.toList());
                for (Bill bill:bills) {
                    totalPrice+=bill.getPrice();
                }
            }
        }
        return totalPrice;
    }
}
