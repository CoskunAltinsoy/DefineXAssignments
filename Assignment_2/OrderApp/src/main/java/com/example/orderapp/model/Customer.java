package com.example.orderapp.model;

import lombok.Data;

import java.util.List;

public abstract class Customer {
    private Long id;
    private String email;
    private  List<Order> orders;
    private List<Bill> bills;

    public Customer() {
    }

    public Customer(Long id, String email, List<Order> orders, List<Bill> bills) {
        this.id = id;
        this.email = email;
        this.orders = orders;
        this.bills = bills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public void setBills(List<Bill> bills) {
        this.bills = bills;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", orders=" + orders +
                ", bills=" + bills +
                '}';
    }
}
