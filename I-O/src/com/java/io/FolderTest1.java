package com.java.io;

import java.io.File;

public class FolderTest1 {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D://java1";
        //获取file对象
        File file = new File(path);
        //遍历path下的文件和目录 放在file数组中
        File[] fs =file.listFiles();
        for (File f:fs){
            String srcFileName = f.getName();
            int position = srcFileName.indexOf(".");
            String suffixName =srcFileName.substring(position);
            if (suffixName.equals(".jpg")||suffixName.equals(".png")){
                System.out.println(f);
            }
        }
    }}
