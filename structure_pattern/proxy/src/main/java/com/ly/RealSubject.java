package com.ly;

public class RealSubject implements ISubject{
    @Override
    public void doSomething1(Object a, Object b) {
        System.out.println("DoSomething1:  ..");
    }

    @Override
    public void doSomething2(Object a, Object b) {
        System.out.println("DoSomething2 :....");
    }
}
