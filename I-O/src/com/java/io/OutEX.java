package com.java.io;


import java.io.*;

public class OutEX {
    public static void main(String[] args) throws IOException {
        String str ="I love Java";
        File file = new File("D:/out1.txt");
        if (!file.exists()){
            file.createNewFile();

        }
        OutputStream out =new FileOutputStream(file);
        PrintStream printStream =new PrintStream(out);
        printStream.print(str);

    }
}
