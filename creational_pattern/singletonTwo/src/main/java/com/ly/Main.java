
package com.ly;
public class Main {

    Employee emp = new Employee();
    Employee emp1=emp.getInstance();
    Employee emp2=emp.getInstance();


    public static void main(String[] args){

        System.out.println(emp1==emp2)
        System.out.println("how are you");
    }

}
