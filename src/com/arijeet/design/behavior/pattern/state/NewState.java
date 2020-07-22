package com.arijeet.design.behavior.pattern.state;

public class NewState implements OrderState{

    @Override
    public void handleCancellation() {
        System.out.println("As new order, its unpaid. No processing required");
    }
}
