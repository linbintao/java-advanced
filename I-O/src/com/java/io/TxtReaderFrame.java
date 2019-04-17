package com.java.io;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * txt文件阅读器窗体
 * @autho 林
 * 2019.4.1
 */
public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField inputFiled;
    private JButton confirmButton;
    private JPanel  topPanel;
    private JTextArea contentArea;

    public TxtReaderFrame(){
        init();
        setTitle("文本阅读窗体");
        setSize(new Dimension(640,480));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        inputFiled = new JTextField(20);
        inputFiled.setPreferredSize(new Dimension(120,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(120,40));
        topPanel = new JPanel();
        topPanel.add(inputFiled);
        topPanel.add(confirmButton);
        //给按钮注册监听
        confirmButton.addActionListener(this);
        add(topPanel,BorderLayout.NORTH);
        //中间多行文本域
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        new TxtReaderFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取输入框内容
        String filePath = inputFiled.getText().trim();
        //创建文件
        File file = new File(filePath);
        //三种方法将file内容读入
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            String resultStr = new String(bytes);
            contentArea.append(resultStr);
            //追加一次回车换行
            contentArea.append("\r\n");
        } catch (IOException e1) {
            System.out.println("IO异常");
        }

    }
}

