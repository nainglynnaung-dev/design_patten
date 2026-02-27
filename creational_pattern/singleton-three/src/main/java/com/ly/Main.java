package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = Employee.getInstance();
        Employee employee2 = Employee.getInstance();

        
        System.out.println(employee1 == employee2);
    }
}