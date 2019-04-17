package com.java.io;
/**
 * 将UUID作为新的文件名
 */

import java.io.*;
import java.util.UUID;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //指定源文件
        File srcFile =new File("D:/code.jpg");
        //获取源文件名
        String sreFileName =srcFile.getName();
        int position =sreFileName.indexOf(".");
        //取得源文件扩展名
        String suffixname =sreFileName.substring(position +1);
        //新的主文件名
        String newName = UUID.randomUUID().toString();

        //指定目标文件
        File destFile =new File("D:/" + newName +"." +suffixname);
        //创建一个字节数组，大小源文件长度转化成int
        byte[] bytes =new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in =new FileInputStream(srcFile);
        //读入
        in.read(bytes);
        //创建输出
        OutputStream out =new FileOutputStream(destFile);
          //将字节数组写入目标文件
        out.write(bytes);
        //关闭输入输出流
        in.close();
        out.close();
    }
}
