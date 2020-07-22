package com.arijeet.design.behavior.pattern.state;

public class DeliveredState implements OrderState{
    @Override
    public void handleCancellation() {
        System.out.println("Courier Service to contact you to receive the item.");
    }
}
