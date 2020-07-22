package com.arijeet.design.behavior.pattern.state;

public class CancelledState implements OrderState{

    @Override
    public void handleCancellation() {
        System.out.println("Order already cancelled. No processing");
        throw new IllegalStateException("Order already cancelled. No processing");
    }
}
