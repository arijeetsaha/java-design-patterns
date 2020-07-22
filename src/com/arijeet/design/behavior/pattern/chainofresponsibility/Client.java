package com.arijeet.design.behavior.pattern.chainofresponsibility;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        LeaveApplication leaveApplication = new LeaveApplication(LeaveApplication.Type.LOP, LocalDate.now().minusDays(15), LocalDate.now());
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(leaveApplication);
    }

    private static LeaveApprover createChain() {

        Director director = new Director(null);
        ProjectManager projectManager = new ProjectManager(director);
        ProjectLead projectLead = new ProjectLead(projectManager);
        return projectLead;

    }
}
