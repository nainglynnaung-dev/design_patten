package com.ly;

public class Proxy implements ISubject{
    private RealSubject realSubject;

   public Proxy(RealSubject realSubject){
        this.realSubject=realSubject;
    }
    @Override
    public void doSomething1(Object a, Object b) {
       doSomethingExtra();
        realSubject.doSomething1(a,b);
    }

    @Override
    public void doSomething2(Object a, Object b) {
       doSomethingExtra();
          realSubject.doSomething2(a,b);
    }

    public void doSomethingExtra(){
        System.out.println("Do Something before method call");
    }
}
