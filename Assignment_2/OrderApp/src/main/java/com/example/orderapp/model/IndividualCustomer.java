package com.example.orderapp.model;

import java.time.LocalDate;
import java.util.List;

public class IndividualCustomer extends  Customer{
    private String firstName;
    private String lastName;
    private String nationalIdentity;


    public IndividualCustomer() {
        super();
    }
    public IndividualCustomer(Long id, String email, LocalDate createdDate, List<Order> orders, List<Bill> bills,
                              String firstName, String lastName, String nationalIdentity) {
        super(id, email,createdDate, orders, bills);
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    @Override
    public String toString() {
        return "IndividualCustomer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nationalIdentity='" + nationalIdentity + '\'' +
                '}';
    }
}
