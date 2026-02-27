package com.ly;
public class Main {
    public static void main(String[] args) {
        Employee employee=Employee.getInstance();
        Employee employee1=Employee.getInstance();
        Employee employee2=Employee.getInstance();

        boolean jest=employee==employee2;

        System.out.println("e1 and e2 and e3 is "+jest);
    }
}