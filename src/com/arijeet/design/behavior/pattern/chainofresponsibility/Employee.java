package com.arijeet.design.behavior.pattern.chainofresponsibility;

import java.util.Objects;

public abstract class Employee implements LeaveApprover{

    final private String role;

    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if(!processRequest(leaveApplication) && Objects.nonNull(successor)) {
            successor.processLeaveApplication(leaveApplication);
        }
    }

    @Override
    public String getApproverRole() {
        return role;
    }

    protected abstract boolean processRequest(LeaveApplication leaveApplication);
}
