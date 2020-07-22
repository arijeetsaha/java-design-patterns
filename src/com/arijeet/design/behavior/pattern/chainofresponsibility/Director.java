package com.arijeet.design.behavior.pattern.chainofresponsibility;

public class Director extends Employee{

    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if(LeaveApplication.Type.LOP == leaveApplication.getType()){
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
