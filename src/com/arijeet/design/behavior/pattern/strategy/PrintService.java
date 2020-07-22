package com.arijeet.design.behavior.pattern.strategy;

import java.util.List;

public class PrintService {

    private  OrderPrinter orderPrinter;

    public PrintService(OrderPrinter orderPrinter) {
        this.orderPrinter = orderPrinter;
    }

    public void printOrders(List<Order> orderList) {
        orderPrinter.print(orderList);
    }
}
