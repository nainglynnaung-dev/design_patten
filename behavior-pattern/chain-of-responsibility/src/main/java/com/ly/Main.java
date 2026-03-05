package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BackendHelper backendHelper=new BackendHelper();
        MiddleHelper middleHelper = new MiddleHelper(backendHelper);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FrontEndHelper frontEndHelper = new FrontEndHelper(middleHelper);

        middleHelper.help(4);
        frontEndHelper.help(5);
        backendHelper.help(5);
    }
}