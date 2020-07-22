package com.arijeet.design.behavior.pattern.chainofresponsibility;

public class ProjectManager extends Employee{

    public ProjectManager(LeaveApprover successor) {
        super("Project Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case Sick:
                leaveApplication.approve(getApproverRole());
                return true;
            case PTO:
               if(leaveApplication.getNoOfDays() <= 10) {
                    leaveApplication.approve(getApproverRole());
                   return true;
               }
        }
        return false;
    }
}
