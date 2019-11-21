package com.thoughtworks.domain;

import java.util.List;

public class Order {

    private final List<Service> services;
    private final List<Debt> debts;
    private final List<Customer> customers;

    public Order(List<Service> services, List<Debt> debts, List<Customer> customers) {
        this.services = services;
        this.debts = debts;
        this.customers = customers;
    }

}
