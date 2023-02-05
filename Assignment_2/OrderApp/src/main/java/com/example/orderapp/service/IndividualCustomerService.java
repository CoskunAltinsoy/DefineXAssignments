package com.example.orderapp.service;

import com.example.orderapp.model.Bill;
import com.example.orderapp.model.Customer;
import com.example.orderapp.model.IndividualCustomer;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IndividualCustomerService {
    private final List<IndividualCustomer> individualCustomers;
    public IndividualCustomerService() {
        this.individualCustomers = new ArrayList<>();
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

    public List<IndividualCustomer> getIndividualCustomersContainC() {
        List<IndividualCustomer> customers = new ArrayList<>();
        for (IndividualCustomer customer:this.individualCustomers) {
            if (customer.getFirstName().toLowerCase().contains("c")){
                customers.add(customer);
            }
        }
        return customers;
    }
    public Double getAllPriceCreatedInJune(){
        double totalPrice = 0;
        for (IndividualCustomer customer: individualCustomers) {
            if (customer.getCreatedDate().getMonth().equals(Month.JUNE)){
                List<Bill> bills = customer.getBills();
                for (Bill bill:bills) {
                    totalPrice+=bill.getPrice();
                }
            }
        }
        return totalPrice;
    }

    public List<Bill> getAllBills(){
        List<Bill> bills = new ArrayList<>();
        for (IndividualCustomer individualCustomer: individualCustomers) {
            bills.addAll(individualCustomer.getBills());
        }
        return bills;
    }

    public List<Bill> getAllBillsMoreThanOneThousandFiveHundred(){
        List<Bill> bills = new ArrayList<>();
        for (IndividualCustomer individualCustomer: individualCustomers) {
            bills.addAll(individualCustomer.getBills().stream().filter(x->x.getPrice()>1500)
                    .collect(Collectors.toList()));
        }
        return bills;
    }
    public Double getAvarageOfBillsMoreThanOneThousandFiveHundred(){
        List<Bill> bills = new ArrayList<>();
        double average = 0d;
        double totalPrice = 0d;
        for (IndividualCustomer individualCustomer: individualCustomers) {
            bills.addAll(individualCustomer.getBills().stream().filter(x->x.getPrice()>1500)
                    .collect(Collectors.toList()));
        }
        int billSize = bills.size();
        for (Bill bill: bills) {
            totalPrice += bill.getPrice();
        };
        average = totalPrice/billSize;

        return average;
    }
    public List<String> getAllIndividualCustomerLessThanFiveHundred(){
        List<String> fullNameList = new ArrayList<>();
        for (IndividualCustomer individualCustomer: individualCustomers) {
            List<Bill> bills = individualCustomer.getBills().stream().filter(x->x.getPrice()<500)
                    .collect(Collectors.toList());
            if(!bills.isEmpty()){
                fullNameList.add(individualCustomer.getFirstName() + " " +individualCustomer.getLastName());
            }

        }
        return fullNameList;
    }
}
