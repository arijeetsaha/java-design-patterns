package com.arijeet.design.behavior.pattern.chainofresponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
