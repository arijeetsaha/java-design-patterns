package com.arijeet.design.behavior.pattern.chainofresponsibility;

public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        if(LeaveApplication.Type.Sick == leaveApplication.getType()
                && leaveApplication.getNoOfDays() <= 2) {
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
