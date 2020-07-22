package com.arijeet.design.behavior.pattern.command;

public class AddMemberCommand implements Command{

    private String emailAddress;

    private String distributionList;

    // Receiver obejct is optional. This can be get hold of using Spring IOC Container
    private EWSService receiver;

    public AddMemberCommand(String emailAddress, String distributionList, EWSService receiver) {
        this.emailAddress = emailAddress;
        this.distributionList = distributionList;
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, distributionList);
    }
}
