package com.java.io;
import java.io.*;

/**
 * 带缓冲的输入输出流
 * @autho林
 * 4.4
 */
public class BufferedStreamTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"你不喜欢我，","我一点都不介意。","因为我活下来，","不是为了取悦你！"};
        File file = new File("word.txt");
        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            byte[] bContent = new byte[1024];
            for (int k = 0;k < content.length;k++){
                bContent = content[k].getBytes();
                bufferedOutputStream.write(bContent);
            }
            System.out.println("写入成功！\n");
        } catch (IOException e) {           //处理异常
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            byte[] bContent = new byte[1024];
            int len = bufferedInputStream.read(bContent);
            System.out.println("文件中的信息是：" + new String(bContent,0,len));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}