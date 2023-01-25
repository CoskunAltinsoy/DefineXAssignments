package com.example.orderapp.model;

import java.time.LocalDate;
import java.util.List;

public class CorporateCustomer extends  Customer{
    private String companyName;
    public CorporateCustomer() {
        super();
    }
    public CorporateCustomer(Long id, String email, LocalDate createdDate, List<Order> orders, List<Bill> bills, String companyName) {
        super(id, email,createdDate,orders, bills);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
