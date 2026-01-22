package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Student student=new Student("Naing Lynn Aung",25,"Hleden Rd.Kamayut","james342506@gmail.com");
       Student student1= (Student) student.clone();
       student1.setEmail("Kingkongv138@gmail.com");
        System.out.println(student1.toString() + "student1");
        System.out.println(student.toString() + "student");
    }
}