package com.soft1841.thread;


import javax.swing.*;

public class Circle extends JFrame {
    public Circle(){
        init();
        setTitle("同心圆");
        setSize(1360,1080);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init(){
        CircleThread circleThread = new CircleThread();
        circleThread.setFrame(this);
        new Thread(circleThread).start();

    }


    public static void main(String[] args) {
        new Circle();
    }
}
