package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {
        Internet internet=new ProxyInternet();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      try{
          internet.connectTo("www.google.com");
          internet.connectTo("www.baidu.com");

      }catch (Exception e){
          System.out.println(e.getMessage());
      }
    }
}