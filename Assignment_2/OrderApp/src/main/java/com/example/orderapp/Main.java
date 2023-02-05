package com.example.orderapp;

import com.example.orderapp.model.*;
import com.example.orderapp.service.CorporateCustomerService;
import com.example.orderapp.service.IndividualCustomerService;
import org.glassfish.jersey.internal.guava.Lists;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        //Created both two IndivudualCustomer and two CorporateCustomer
        //Orders space and Bills space will be set in below
        Customer individualCustomer1 = new IndividualCustomer(1L,"coskun@gmail.com",
                LocalDate.of(2022, Month.JUNE,12),null, null,
                "Mücahit","Altınsoy","21182764900");

        Customer individualCustomer2 = new IndividualCustomer(2L,"coskun@gmail.com",
                LocalDate.of(2022, Month.JULY,18),null,null,
                "Coskun","Altınsoy","12343525344");

        Customer corporateCustomer1 = new CorporateCustomer(1L,"xxxx@Gmail.com",
                LocalDate.of(2022, Month.JUNE,12), null,null,
                "DefineX","Tecnology,Consulting");

        Customer corporateCustomer2 = new CorporateCustomer(2L,"xxxx@Gmail.com",
                LocalDate.of(2022, Month.JUNE,12), null,null,
                "Huawei","Tecnology");

        //Created six bill
        Bill bill1 = new Bill(1L,400D,individualCustomer1);
        Bill bill2 = new Bill(2L,2000D,individualCustomer1);
        Bill bill3 = new Bill(3L,3000D,individualCustomer2);
        Bill bill4 = new Bill(4L,5000D,individualCustomer2);
        Bill bill5 = new Bill(5L,700D,corporateCustomer2);
        Bill bill6 = new Bill(6L,600D,corporateCustomer1);

        //Bill was added to a list to be set to customer classes
        List<Bill> billsForIndivudual1 = new ArrayList<>();
        billsForIndivudual1.add(bill1);
        billsForIndivudual1.add(bill2);

        List<Bill> billsForIndivudual2 = new ArrayList<>();
        billsForIndivudual2.add(bill3);
        billsForIndivudual2.add(bill4);

        List<Bill> billsForCorporate1 = new ArrayList<>();
        billsForCorporate1.add(bill6);

        List<Bill> billsForCorporate2 = new ArrayList<>();
        billsForCorporate2.add(bill5);

        //Created six Order
        Order order1 = new Order(1L,LocalDate.of(2023, Month.JUNE,12),individualCustomer1);
        Order order2 = new Order(2L,LocalDate.of(2023, Month.JULY,18),individualCustomer1);
        Order order3 = new Order(3L,LocalDate.of(2022, Month.JUNE,1),individualCustomer2);
        Order order4 = new Order(4L,LocalDate.of(2023, Month.MARCH,9),individualCustomer2);
        Order order5 = new Order(5L,LocalDate.of(2023, Month.DECEMBER,20),corporateCustomer2);
        Order order6 = new Order(6L,LocalDate.of(2023, Month.JUNE,29),corporateCustomer1);

        //Order was added to a list to be set to customer classes
        List<Order> ordersForIndivudual1 = new ArrayList<>();
        ordersForIndivudual1.add(order1);
        ordersForIndivudual1.add(order2);

        List<Order> ordersForIndivudual2 = new ArrayList<>();
        ordersForIndivudual2.add(order3);
        ordersForIndivudual2.add(order4);

        List<Order> ordersForCorporate1 = new ArrayList<>();
        ordersForIndivudual1.add(order6);

        List<Order> ordersForCorporate2 = new ArrayList<>();
        ordersForIndivudual1.add(order5);

        //Orders and Bills were set for each customer
        individualCustomer1.setBills(billsForIndivudual1);
        individualCustomer1.setOrders(ordersForIndivudual1);

        individualCustomer2.setBills(billsForIndivudual2);
        individualCustomer2.setOrders(ordersForIndivudual2);

        corporateCustomer1.setBills(billsForCorporate1);
        corporateCustomer1.setOrders(ordersForCorporate1);

        corporateCustomer2.setBills(billsForCorporate2);
        corporateCustomer2.setOrders(ordersForCorporate2);

        //Object was created from IndividualCustomerService
        IndividualCustomerService individualCustomerService =
                new IndividualCustomerService();

        //Individual customers were created by createIndividualCustomer function
        individualCustomerService.createIndividualCustomer((IndividualCustomer) individualCustomer1);
        individualCustomerService.createIndividualCustomer((IndividualCustomer) individualCustomer2);

        //Object was created from CorporateCustomerService
        CorporateCustomerService corporateCustomerService =
                new CorporateCustomerService();

        //Corporate customers were created by createCorporateCustomer function
        corporateCustomerService.createCorporatelCustomer((CorporateCustomer) corporateCustomer1);
        corporateCustomerService.createCorporatelCustomer((CorporateCustomer) corporateCustomer2);

        System.out.println(individualCustomerService.getAllIndividualCustomers()+"\n"+
                        individualCustomerService.getIndividualCustomersContainC()+"\n"+
                        individualCustomerService.getAllPriceCreatedInJune()+"\n"+
                        individualCustomerService.getAllBills()+"\n"+
                        individualCustomerService.getAllBillsMoreThanOneThousandFiveHundred()+"\n"+
                        individualCustomerService.getAvarageOfBillsMoreThanOneThousandFiveHundred()+"\n"+
                        individualCustomerService.getAllIndividualCustomerLessThanFiveHundred()+"\n"+
                        corporateCustomerService.getSectorsBillsLowerThanSevenHundredFiftyInJune()
                );


    }
}
