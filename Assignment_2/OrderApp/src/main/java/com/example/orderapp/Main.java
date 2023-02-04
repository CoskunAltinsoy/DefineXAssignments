package com.example.orderapp;

import com.example.orderapp.model.*;
import com.example.orderapp.service.IndividualCustomerService;
import org.glassfish.jersey.internal.guava.Lists;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){


        Customer individualCustomer1 = new IndividualCustomer(1L,"coskun@gmail.com",
                LocalDate.now(),null, null, "Mücahit","Altınsoy","21182764900");

        Customer individualCustomer2 = new IndividualCustomer(2L,"coskun@gmail.com",
                LocalDate.now(),null,null,"Coskun","Altınsoy","12343525344");

        Customer corporateCustomer1 = new CorporateCustomer(1L,"xxxx@Gmail.com",LocalDate.now(),null,null,
                "DefineX","Tecnology,Consulting");

        Customer corporateCustomer2 = new CorporateCustomer(2L,"xxxx@Gmail.com",LocalDate.now(),null,null,
                "Huawei","Tecnology");


        Bill bill1 = new Bill(1L,1000D,individualCustomer1);
        Bill bill2 = new Bill(2L,2000D,individualCustomer1);
        Bill bill3 = new Bill(3L,3000D,individualCustomer2);
        Bill bill4 = new Bill(4L,5000D,individualCustomer2);
        Bill bill5 = new Bill(5L,3000D,corporateCustomer2);
        Bill bill6 = new Bill(6L,5000D,corporateCustomer1);


        List<Bill> billsForIndivudual1 = new ArrayList<>();
        billsForIndivudual1.add(bill1);
        billsForIndivudual1.add(bill2);

        List<Bill> billsForIndivudual2 = new ArrayList<>();
        billsForIndivudual2.add(bill3);
        billsForIndivudual2.add(bill4);

        List<Bill> billsForCorporate1 = new ArrayList<>();
        billsForIndivudual1.add(bill6);

        List<Bill> billsForCorporate2 = new ArrayList<>();
        billsForIndivudual1.add(bill5);


        Order order1 = new Order(1L,LocalDate.now(),individualCustomer1);
        Order order2 = new Order(2L,LocalDate.now(),individualCustomer1);
        Order order3 = new Order(3L,LocalDate.now(),individualCustomer2);
        Order order4 = new Order(4L,LocalDate.now(),individualCustomer2);
        Order order5 = new Order(5L,LocalDate.now(),corporateCustomer2);
        Order order6 = new Order(6L,LocalDate.now(),corporateCustomer1);


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


        individualCustomer1.setBills(billsForIndivudual1);
        individualCustomer1.setOrders(ordersForIndivudual1);

        individualCustomer2.setBills(billsForIndivudual2);
        individualCustomer2.setOrders(ordersForIndivudual2);

        corporateCustomer1.setBills(billsForCorporate1);
        corporateCustomer1.setOrders(ordersForCorporate1);

        corporateCustomer2.setBills(billsForCorporate2);
        corporateCustomer2.setOrders(ordersForCorporate2);

        List<IndividualCustomer> individualCustomers1 = new ArrayList<>();
        individualCustomers1.add((IndividualCustomer)individualCustomer1);
        individualCustomers1.add((IndividualCustomer)individualCustomer2);

        List<IndividualCustomer> individualCustomers2 = new ArrayList<>();
        //individualCustomers2.add((IndividualCustomer)i);

        IndividualCustomerService customerService =
                new IndividualCustomerService(individualCustomers1);
        System.out.println(customerService.getIndividualCustomersContainC());


    }
}
