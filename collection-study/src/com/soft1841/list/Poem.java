package com.soft1841.list;

import javax.swing.*;
import java.awt.*;

/**
 * @author 林斌涛
 * 2019.3.25
 */
public class Poem extends JFrame {
    public Poem(){
        setTitle("流布局的使用");
        Container container = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,30,30));
        container.add(new JButton("下面哪一句诗是描写夏天的？"));
        container.add(new JButton("A  秋风萧瑟天气凉，草木摇荡露为霜。"));
        container.add(new JButton("B  白雪纷纷何所似，撒盐空中差可拟。"));
        container.add(new JButton("C  接天莲叶无穷碧，映日荷花别样红。"));
        container.add(new JButton("D  竹外桃花三两枝，春江水暖鸭先知。"));
        //设置窗体大小
        setSize(500,400);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        //设置窗体可见
        setVisible(true);
        //禁止改变窗体大小
        setResizable(false);
    }
    public static void main(String[] args) {
        new Poem();
    }
}
