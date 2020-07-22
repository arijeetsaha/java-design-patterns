package com.arijeet.design.behavior.pattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private static List<Order> orderList = new ArrayList<>();

    public static void main(String[] args) {
        createOrders();

        PrintService printService = new PrintService(new SummaryPrinter());
        printService.printOrders(orderList);
    }

    private static void createOrders() {
        Order o = new Order("100");
        o.addItem("Chips", 2);
        o.addItem("Icecream", 4);
        orderList.add(o);

        o = new Order("200");
        o.addItem("Bread", 20);
        o.addItem("tea", 4);
        orderList.add(o);

        o = new Order("300");
        o.addItem("Cheese", 2);
        o.addItem("Milk", 41);
        orderList.add(o);

    }
}
