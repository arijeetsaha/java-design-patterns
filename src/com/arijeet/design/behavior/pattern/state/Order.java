package com.arijeet.design.behavior.pattern.state;

//Context Class
public class Order {

    private OrderState orderState;

    public Order() {
        orderState = new NewState();
    }

    public void cancel() {
        orderState.handleCancellation();
        orderState = new CancelledState();
    }

    public void paymentSuccessful() {
        //Move to paid state
        orderState = new PaidState();
    }

    public void dispatched() {
        orderState = new InTransitOrder();
    }

    public void delivered() {
        orderState = new DeliveredState();
    }
}
