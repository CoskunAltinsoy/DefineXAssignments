package com.example.orderapp.model;

import java.time.LocalDate;
import java.util.List;

public class CorporateCustomer extends  Customer{
    private String companyName;
    private String sectorName;
    public CorporateCustomer() {
        super();
    }
    public CorporateCustomer(Long id, String email, LocalDate createdDate, List<Order> orders,
                             List<Bill> bills, String companyName, String sectorName) {
        super(id, email,createdDate,orders, bills);
        this.companyName = companyName;
        this.sectorName = sectorName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getSectorName() {
        return sectorName;
    }

    public void setSectorName(String sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "CorporateCustomer{" +
                "companyName='" + companyName + '\'' +
                ", sectorName='" + sectorName + '\'' +
                '}';
    }
}
