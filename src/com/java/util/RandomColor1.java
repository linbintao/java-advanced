package com.java.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

/**
 * 随机颜色
 * 林斌涛
 * 3.12
 */
public class RandomColor1 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int redRandom = random.nextInt(256);
        int greenRandom = random.nextInt(256);
        int blueRandom = random.nextInt(256);
        System.out.println("R:" + redRandom + ",G:" + greenRandom + ",B:" + blueRandom );
        //开始用随机色值绘制图片
        //在图片缓冲区生成一个图片对象
        BufferedImage bufferedImage = new BufferedImage(120,40,BufferedImage.TYPE_INT_RGB);
        //获取画笔
        Graphics g =bufferedImage.getGraphics();
        //设置字体
        Font font = new Font("微软雅黑",Font.BOLD,16);
        g.setFont(font);
        //设置画笔颜色
        Color color = new Color(redRandom,greenRandom,blueRandom);
        g.setColor(color);

        //开始绘制矩形，充满图片缓冲区
        g.fillRect(0,0,120,40);
        //输出图片
        //指定文件路径
        g.setColor(Color.GREEN);
        g.drawString("验证码",40,15);
        File file = new File("D:/code.jpg");
        //获取输出流
        OutputStream outputStream = new FileOutputStream(file);
        //将图片从缓冲区通过字节流写到文件
        ImageIO.write(bufferedImage,"jpg",outputStream);
        outputStream.close();
    }
}