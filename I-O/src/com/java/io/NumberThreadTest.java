package com.java.io;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NumberThreadTest extends Thread {
    private JLabel numberLabel;
    public void setNumberLabel(JLabel numberLabel){
        this.numberLabel = numberLabel;
    }
    @Override
    public void run() {
        Random random = new Random();
        while(true){
            int num = random.nextInt(100);
            numberLabel.setText(String.valueOf(num));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
