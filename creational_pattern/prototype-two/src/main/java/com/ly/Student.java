package com.ly;

public class Student implements IPrototype{
    private String name;
    private int age;
    private String address;
    private String phone;

    public Student(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public IPrototype clone() {
       try {
           return (IPrototype) super.clone();
       } catch (CloneNotSupportedException e) {
           throw new RuntimeException(e);
       }
    }
}
