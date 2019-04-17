package com.soft1841.thread;

import javax.swing.*;

/**
 * 模拟红绿灯变化场景线程程序
 * 2019.04.15
 */
public class TurnColor extends Thread {
    private JLabel bgLabel;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
        while (true) { // 线程始终处于被启用状态
            try {
                Thread.sleep(5000); // 线程休眠5秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Yellow.jpg"))); // 黄灯
            try {
                Thread.sleep(2000); // 线程休眠2秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Red.jpg"))); // 红灯
            try {
                Thread.sleep(8000); // 线程休眠8秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bgLabel.setIcon(new ImageIcon(TrafficLights.class.getResource("/img/Green.jpg"))); // 绿灯
        }
    }
}
