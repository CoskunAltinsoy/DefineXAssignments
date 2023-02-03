package com.example.orderapp.service;

import com.example.orderapp.model.Bill;
import com.example.orderapp.model.CorporateCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CorporateCustomerService {
    private List<CorporateCustomer> corporateCustomers;
    public CorporateCustomerService(List<CorporateCustomer> corporateCustomers) {
        this.corporateCustomers = corporateCustomers;
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
