package com.arijeet.design.behavior.pattern.strategy;

import java.util.Collection;

public class OrderDetailPrinter implements OrderPrinter{
    @Override
    public void print(Collection<Order> orders) {
        System.out.println("----------------Order Details printer-------------------");

        // Logic

        System.out.println("---------------------------------------------------------");
    }
}
