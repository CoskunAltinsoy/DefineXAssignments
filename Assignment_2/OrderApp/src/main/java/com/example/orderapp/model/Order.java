package com.example.orderapp.model;

import java.time.LocalDate;

public class Order {
    private Long id;
    private LocalDate orderDate;
    private Customer customer;

    public Order() {
    }

    public Order(Long id, LocalDate orderDate, Customer customer) {
        this.id = id;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                '}';
    }
}
