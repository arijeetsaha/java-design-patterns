package com.arijeet.design.behavior.pattern.state;

public class InTransitOrder implements OrderState{
    @Override
    public void handleCancellation() {
        System.out.println("Order is in transit. Courier service to be contacted for cancellation. Please don't receive the order");
    }
}
