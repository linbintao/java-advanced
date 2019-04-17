package com.soft1841.thread;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * 模拟红绿灯变化场景窗体程序
 * 2019.4.15
 */
public class TrafficLights extends JFrame {
    private JPanel contentPanel;
    private JPanel bgPanel;
    private JLabel bgLabel;

    public TrafficLights(){
        init();
        setTitle("模拟红绿灯变化场景");
        setLocationRelativeTo(null);//窗体自动居中
        setSize(100,320);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        //内容面板
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.white);
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setContentPane(contentPanel);
        //图片面板
        bgPanel = new JPanel();
        contentPanel.add(bgPanel);
        bgPanel.setLayout(new BorderLayout(0,0));
        //标签
        bgLabel = new JLabel();
        bgLabel.setBackground(Color.GREEN);
        bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/img/Green.jpg")));
        bgPanel.add(bgLabel,BorderLayout.CENTER);

        TurnColor tc = new TurnColor();
        tc.setBgLabel(bgLabel);
        tc.start();

    }

    public static void main(String[] args) {
        TrafficLights frame = new TrafficLights();
        frame.setVisible(true);
    }
}

