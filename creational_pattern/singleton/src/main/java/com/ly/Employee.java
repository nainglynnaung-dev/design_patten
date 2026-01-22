package com.ly;

public class Employee {

    public static Employee employee;

    Employee(){}

    public static Employee getEmployeeInstance(){
        if (employee==null){
            employee=new Employee();
        }
        return  employee;
    }

}
