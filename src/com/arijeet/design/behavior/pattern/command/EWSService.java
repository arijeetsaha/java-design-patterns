package com.arijeet.design.behavior.pattern.command;

//This is the receiver object
public class EWSService {

    public void addMember(String contact, String contactGroup) {
        System.out.println("Added "+contact+" to "+ contact);
    }

    public void removeMember(String contact, String contactGroup) {
        System.out.println("Removed "+contact+" to "+ contact);
    }
}
