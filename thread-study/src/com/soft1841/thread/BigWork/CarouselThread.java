package com.soft1841.thread.BigWork;

import javax.swing.*;
import java.io.*;

/**
 * 图片轮播
 */
public class CarouselThread implements Runnable{
    //竹北图片路径数组
    private String[] imgs ={"D:/img/22.jpg","D:/img/23.jpg","D:/img/24.jpg","D:/img/25.jpg"};
    //定义一个图片标签
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel){
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int i = 0;
        int len = imgs.length;
        while (true){
            //通过路径构建file对象
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                i++;
                if (i == len) {
                    i = 0;
                }
            }catch (IOException e){
                System.out.println("IO异常");
            }
        }
    }
}
