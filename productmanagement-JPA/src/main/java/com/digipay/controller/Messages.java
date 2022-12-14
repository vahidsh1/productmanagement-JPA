package com.digipay.controller;

import com.digipay.enums.OperationTypes;

class Messages {
    public static void startMessage() {
        System.out.println("Are you a 1- employee or 2-Customer?");
    }
    public static void employeeWelcomeMessage() {
        System.out.println("Welcome to Product Management System!");
        System.out.println("Enter operation type:  " +
                " 1-"+ OperationTypes.Register+" 2-"+OperationTypes.List+
                " 3-"+OperationTypes.Update+" 4-"+OperationTypes.Delete+" ?:");
    }
    public static void customerWelcomeMessage() {
        System.out.println("Enter operation type:  " +
                " 1-"+ OperationTypes.Register+" 2-"+OperationTypes.Enter+" 3-"+OperationTypes.ListCart);
    }
    public static void categoryMessage(){
        System.out.println("Enter Category Type: " +
                "1- Digital , 2-Electrical");
    }
    public static void userMessage() {
        System.out.println("Enter your username:");
    }
    private Messages() {
    }

}
