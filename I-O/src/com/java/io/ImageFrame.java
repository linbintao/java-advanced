package com.java.io;
/**
 * 图片窗体程序
 * @author Lin
 * 03.26
 */

import javax.swing.*;
import javax.xml.soap.Text;
import java.awt.*;
import java.io.*;
import java.util.Calendar;


public class ImageFrame  extends JFrame {
    private JPanel topPanel;
    private JButton[] buttons;
    private JLabel imageLabel;
    private Icon icon;
    private JLabel txtLabel;
    private JLabel timeLabel;



    public ImageFrame()throws IOException{
        init();
        setTitle("图片窗体");
        setSize(1000,600);
        //窗体自动居中
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //设置布局，放置组件
    public void init() throws IOException {
       topPanel = new JPanel();
       buttons =new JButton[5];
       for(int i =0;i<5;i++){
           buttons[i] =new JButton("按钮"+i+1);
           topPanel.add(buttons[i]);

       }
       add(topPanel,BorderLayout.NORTH);
       imageLabel =new JLabel(" ");
       File srcFile =new File("D:/1111.png");

        InputStream  in = new FileInputStream(srcFile);
        byte[]   bytes =new byte[(int) srcFile.length()];
           in.read(bytes);

       icon =new ImageIcon(bytes);
       imageLabel.setIcon(icon);
       add(imageLabel,BorderLayout.CENTER);
        //时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(calendar.YEAR);
        int mouth = calendar.get(calendar.MONTH);
        int day = calendar.get(calendar.DAY_OF_MONTH);
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        int minute = calendar.get(calendar.MINUTE);
        int second = calendar.get(calendar.SECOND);
        String time = year + "-" + mouth + "-" + day + "  " + hour + ":" + minute + ":" + second;
        timeLabel = new JLabel(time);
        add(timeLabel,BorderLayout.WEST);
//路径大小
        txtLabel = new JLabel(srcFile.getAbsolutePath()+"       大小:"+srcFile.length()/1024+"KB", JLabel.CENTER);
        txtLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
        add(txtLabel, BorderLayout.SOUTH);
    }


    public static void main(String[] args)throws IOException {
        new ImageFrame();
    }
}