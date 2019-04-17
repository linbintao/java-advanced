package com.java.io;

import java.io.File;

public class FolderTest {
    public static void main(String[] args) {
        String path ="D://java";
        for(int i =1;i<=10;i++){
            File folder = new File(path +"//"+i);
            if(!folder.exists()){
                folder.mkdirs();
            }
        }
    }
}
