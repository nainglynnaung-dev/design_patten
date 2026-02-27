package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       BankAccount account=new BankAccount.Builder().setAccountNumber("1234567890").setOwner("John Doe").setPremium(true).build();
       System.out.println(account.toString());
    }
}