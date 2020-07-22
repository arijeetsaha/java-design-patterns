package com.arijeet.design.behavior.pattern.command;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        EWSService ewsService = new EWSService();
        Command addCommand = new AddMemberCommand("aa@gmail.com", "spam", ewsService);
        MailTasksRunner.getInstance().addCommand(addCommand);

        Command addCommand2 = new AddMemberCommand("bb@gmail.com", "spam", ewsService);
        MailTasksRunner.getInstance().addCommand(addCommand2);

        Thread.sleep(3000);

        MailTasksRunner.getInstance().shutdown();

    }
}
