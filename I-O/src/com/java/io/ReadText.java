package com.java.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) throws IOException {
        File desFile = new File("D:/reader.txt");
        System.out.println("请输入内容");
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        char[] chars = str.toCharArray();
        Writer out = new FileWriter(desFile);
        out.write(chars);
        out.close();
    }
}





