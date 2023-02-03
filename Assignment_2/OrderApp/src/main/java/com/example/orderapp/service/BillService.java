package com.example.orderapp.service;

import com.example.orderapp.model.Bill;
import com.example.orderapp.model.IndividualCustomer;

import java.util.List;

public class BillService {
    private final List<Bill> bills;
    public BillService(List<Bill> bills) {
        this.bills = bills;
    }


}
