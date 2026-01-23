package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         ISubject iSubject=new Proxy(new RealSubject());
         iSubject.doSomething1("Hello",2);
         iSubject.doSomething2("Life is ","beautiful");
    }
}