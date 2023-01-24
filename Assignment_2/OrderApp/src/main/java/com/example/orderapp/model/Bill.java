package com.example.orderapp.model;

public class Bill {
    private Long id;
    private Double price;
    private Customer customer;

    public Bill() {
    }
    public Bill(Long id, Double price, Customer customer) {
        this.id = id;
        this.price = price;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", price=" + price +
                ", customer=" + customer +
                '}';
    }
}
