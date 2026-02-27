package com.ly;

public class Employee {

    private static Employee instance;

    Employee() {

    }

    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }
}
