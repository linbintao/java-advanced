package com.java.io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        String pathName =new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        File path = new File("D:/aaa"+pathName);
        //判断如果file不存在，则创建新文件
        if(!path.exists()){
           path.mkdirs();
        }
        File file= new File(path +"/" +"Hello"+pathName+".txt");
        if (!file.exists());
          file.createNewFile();
}
    }

