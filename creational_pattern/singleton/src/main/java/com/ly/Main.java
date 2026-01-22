package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee=Employee.getEmployeeInstance();
        Employee employee1=Employee.getEmployeeInstance();
        Employee employee2=Employee.getEmployeeInstance();

        boolean jest=employee==employee2;

        System.out.println("e1 and e2 and e3 is "+jest);
    }
}