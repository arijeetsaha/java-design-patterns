package com.arijeet.design.behavior.pattern.state;

public class PaidState implements OrderState{
    @Override
    public void handleCancellation() {
        System.out.println("Payment was already done. Payment gateway to refund transaction");
    }
}
