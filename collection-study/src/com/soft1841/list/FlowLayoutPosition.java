package com.soft1841.list;

import javax.swing.*;
import java.awt.*;

/**
 * 流布局
 * @author 林斌涛
 * 2019.3.15
 */
public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        setTitle("本窗口使用流布局管理器");
        Container container = getContentPane();
        //使组件右对齐，组件之间水平间隔10像素，垂直间隔10像素
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        //在容器中循环添加10个按钮
        for (int i = 0;i < 10;i++){
            container.add(new JButton("Button" + i));
        }
        //设置窗体大小
        setSize(400,300);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //设置窗体可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutPosition();
    }
}