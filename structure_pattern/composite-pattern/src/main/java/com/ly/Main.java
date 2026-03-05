package com.ly;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        File file=new File("man.jpg");
        File file2=new File("man2.jpg");
        File file3=new File("man3.jpg");
        File file4=new File("man4.jpg");

        Folder folder=new Folder("myPic");
        Folder folder2=new Folder("myPic2");


        folder.addItem(file);
        folder.addItem(file2);
        folder2.addItem(file3);
        folder.addItem(folder2);

        folder.showDetails();
    }
}