package com.soft1841.thread;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CarouselFrame extends JFrame {
    private JLabel bgLabel;

    public CarouselFrame() {
        init();
        setTitle("轮播");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void init() {
        bgLabel = new JLabel();
        add(bgLabel);
        CarouselThread ct = new CarouselThread();
        ct.setBgLabel(bgLabel);
        new Thread(ct).start();
    }

    public static void main(String[] args) {
        new CarouselFrame();
    }
}


class CarouselThread implements Runnable {
    private String[] imgs = {"D:/photo/1.jpg","D:/photo/2.jpg","D:/photo/3.jpg" ,"D:/photo/4.jpg"};
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        int i = 0;
        int len = imgs.length - 1;
        while (true) {
            try {
                File file = new File(imgs[i]);
                InputStream inputStream = new FileInputStream(file);
                byte[] bytes = new byte[(int) file.length()];
                inputStream.read(bytes);
                Icon icon = new ImageIcon(bytes);
                bgLabel.setIcon(icon);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                if (i == len) {
                    i = 0;
                }
            } catch (IOException e) {
                System.err.println("IO异常");
            }
        }
    }
}