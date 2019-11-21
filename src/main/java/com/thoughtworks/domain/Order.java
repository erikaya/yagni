package com.thoughtworks.domain;

import java.util.List;

public class Order {

    private List<Service> services;

    private List<Debt> debts;

    public Order(List<Service> services, List<Debt> debts) {
        this.services = services;
        this.debts = debts;
    }

}
