package com.ly;

public class File implements FileSystemItem{

    private String name;

    public File(String name){
       this.name=name;
    }

    @Override
    public void showDetails() {
        System.out.println( "File: " + name);
    }
}
