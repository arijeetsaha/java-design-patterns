package com.arijeet.design.behavior.pattern.chainofresponsibility;

import javax.management.relation.Role;
import java.time.LocalDate;
import java.time.Period;

//This is the request
public class LeaveApplication {

    public enum Type { Sick, PTO, LOP};

    public enum Status { Pending, Approved, Rejected};

    private Type type;

    private LocalDate from;

    private LocalDate to;

    private String processedBy;

    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getFrom() {
        return from;
    }

    public LocalDate getTo() {
        return to;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public Status getStatus() {
        return status;
    }

    public int getNoOfDays() {
        return Period.between(from, to).getDays();
    }

    public void approve(String approverRole) {
        System.out.println("Leave application approved by "+ approverRole);
    }
}
