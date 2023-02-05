package com.example.orderapp.service;

import com.example.orderapp.model.Bill;
import com.example.orderapp.model.CorporateCustomer;
import com.example.orderapp.model.IndividualCustomer;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CorporateCustomerService {
    private List<CorporateCustomer> corporateCustomers;
    public CorporateCustomerService() {
        this.corporateCustomers = new ArrayList<>();
    }
    public List<CorporateCustomer> getAllCorporateCustomers(){
        return this.corporateCustomers.stream().map(x->x).collect(Collectors.toList());
    }

    public List<CorporateCustomer> getCorporateCustomersById(Long id){
        return this.corporateCustomers.stream().filter(x->x.getId()==id).collect(Collectors.toList());
    }

    public void createCorporatelCustomer(CorporateCustomer customer){
        this.corporateCustomers.add(customer);
    }

    public List<CorporateCustomer> getCorporateCustomersContainC() {
        List<CorporateCustomer> customers = new ArrayList<>();
        for (CorporateCustomer customer:this.corporateCustomers) {
            if (customer.getCompanyName().toLowerCase().contains("c")){
                customers.add(customer);
            }
        }
        return customers;
    }
    public Double getAllPriceCreatedInJune(){
        double totalPrice = 0;
        for (CorporateCustomer customer: corporateCustomers) {
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
        for (CorporateCustomer corporateCustomer: corporateCustomers) {
            bills.addAll(corporateCustomer.getBills());
        }
        return bills;
    }

    public List<Bill> getAllBillsMoreThanOneThousandFiveHundred(){
        List<Bill> bills = new ArrayList<>();
        for (CorporateCustomer corporateCustomer: corporateCustomers) {
            bills.addAll(corporateCustomer.getBills().stream().filter(x->x.getPrice()>1500)
                    .collect(Collectors.toList()));
        }
        return bills;
    }
    public Double getAvarageOfBillsMoreThanOneThousandFiveHundred(){
        List<Bill> bills = new ArrayList<>();
        double average = 0d;
        double totalPrice = 0d;
        for (CorporateCustomer corporateCustomer: corporateCustomers) {
            bills.addAll(corporateCustomer.getBills().stream().filter(x->x.getPrice()>1500)
                    .collect(Collectors.toList()));
        }
        int billSize = bills.size();
        for (Bill bill: bills) {
            totalPrice += bill.getPrice();
        };
        average = totalPrice/billSize;

        return average;
    }
    public List<String> getAllCorporateCustomerLessThanFiveHundred(){
        List<String> nameList = new ArrayList<>();
        for (CorporateCustomer corporateCustomer: corporateCustomers) {
            List<Bill> bills = corporateCustomer.getBills().stream().filter(x->x.getPrice()<500)
                    .collect(Collectors.toList());
            if(!bills.isEmpty()){
                nameList.add(corporateCustomer.getCompanyName());
            }

        }
        return nameList;
    }

    public List<String> getSectorsBillsLowerThanSevenHundredFiftyInJune(){
        List<String> sectorNameList = new ArrayList<>();
        for (CorporateCustomer corporateCustomer:corporateCustomers) {
            List<Bill> bills = corporateCustomer.getBills().stream().filter(x->x.getPrice()<750)
                    .collect(Collectors.toList());
            if(!bills.isEmpty()){
                sectorNameList.add(corporateCustomer.getSectorName());
            }
        }
        return sectorNameList;
    }
}
