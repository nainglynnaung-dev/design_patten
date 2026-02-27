package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "123 Main St", "555-1234");
        Student clonedStudent = (Student) student.clone();
        System.out.println("Original: " + student.getName() + ", " + student.getAge());
        System.out.println("Cloned: " + clonedStudent.getName() + ", " + clonedStudent.getAge());
    }
}