package com.ly;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
    private String name;
    private List<String> files=new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public  void addItem(FileSystemItem item){
        files.add(item.toString());
    }


    @Override
    public void showDetails() {
        System.out.println("Folder: [ "+name +" ]");
        for(String file:files){
            System.out.println(file);
        }
    }
}
