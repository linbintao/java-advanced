package com.soft1841.thread.BigWork;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MusicThread extends JFrame implements ActionListener {
    private JButton chooseBtn, newThreadBtn;
    private JPanel imgPanel, btnPanel;
    private JLabel timeLabel;
    private JTextArea textArea1;
    private JTextArea textArea;
    private JPanel typePanel;

    private TimerTask drawTask, typeTask, clockTask;
    private Timer timer;
    int x = 200;
    int y = 300;
    int width = 50;
    int height = 50;
    public MusicThread() {
        try {
            init();
        } catch (IOException e) {
            e.printStackTrace();
        }
        setTitle("音乐播放器");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init() throws FileNotFoundException {
        chooseBtn = new JButton("选择图片");
        chooseBtn.setBackground(Color.GREEN);
        newThreadBtn = new JButton("播放音乐");
        newThreadBtn.setBackground(Color.cyan);
        btnPanel = new JPanel(new FlowLayout());
        btnPanel.add(chooseBtn);
        btnPanel.add(newThreadBtn);
        add(btnPanel, BorderLayout.NORTH);
        chooseBtn.addActionListener(this);
        newThreadBtn.addActionListener(this);
        imgPanel = new JPanel();
        add(imgPanel, BorderLayout.CENTER);
        timeLabel = new JLabel();
        GetTime getTime = new GetTime();
        Font font = new Font("微软雅黑", Font.BOLD, 60);
        timeLabel.setFont(font);
        getTime.setTimeLabel(timeLabel);
        new Thread(getTime).start();
        add(timeLabel, BorderLayout.SOUTH);









        typePanel = new JPanel();
        typePanel.setPreferredSize(new Dimension(800, 600));
        typePanel.setLayout(new BorderLayout());
        add(typePanel, BorderLayout.EAST);
        textArea = new JTextArea();
        Font font1 = new Font("微软雅黑", Font.BOLD, 24);
        textArea.setFont(font1);
        textArea.setLineWrap(true);
        textArea.setEditable(false);
        typePanel.add(textArea);

        drawTask = new TimerTask() {
            @Override
            public void run() {
                repaint();
                x -= 25;
                y -= 25;
                width += 50;
                height += 50;
                if (x <= 0 || y <= 0) {
                    //取消定时任务
                    cancel();
                }
            }
        };
        File file = new File("D:\\love.txt");
        Reader reader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        try {
            reader.read(chars);
        } catch (IOException e) {
            e.printStackTrace();
        }
        typeTask = new TimerTask() {
            int i = 0;
            int len = chars.length;

            @Override
            public void run() {
                char c = (char) chars[i];
                textArea.append(String.valueOf(c));
                i++;
                if (i == len - 1) {
                    cancel();
                }
            }
        };

        clockTask = new TimerTask() {
            @Override
            public void run() {
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeString = sdf.format(date);
                if(timeString.equals("2019-04-16 08:20:00") ){
                    JOptionPane.showMessageDialog(null, "时间到~~");
                    drawTask.cancel();
                    typeTask.cancel();
                    this.cancel();
                }
            }
        };
        timer = new Timer();
        timer.schedule(drawTask, 0, 1000);
        timer.schedule(typeTask, 2000, 100);
        timer.scheduleAtFixedRate(clockTask, 0, 1000);
}


    public static void main(String[] args) {
        new MusicThread();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == chooseBtn) {
            JLabel imgLabel = new JLabel();
            imgPanel.add(imgLabel);
            ChooseImg chooseImg = new ChooseImg();
            chooseImg.setBgLabel(imgLabel);
            Thread thread = new Thread(chooseImg);
            thread.start();
        } else {
            PlayMusic playMusic = new PlayMusic();
            Thread musicThread = new Thread(playMusic);
            musicThread.start();
        }
    }
}
class ChooseImg implements Runnable {
    private JLabel bgLabel;
    private JFileChooser fileChooser;
    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }
    @Override
    public void run() {
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("D:"));
        fileChooser.setMultiSelectionEnabled(true);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            int i = 0;
            int len = files.length;
            while (true) {
                try {
                    File file = new File(String.valueOf(files[i]));
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
                    System.err.println("IO 异常");
                }
            }
        }
    }
}
class PlayMusic implements Runnable {
    @Override
    public void run() {
        URL url;
        File file = new File("D:\\1.wav");
        try {
            url = file.toURL();
            AudioClip audioClip = Applet.newAudioClip(url);
            audioClip.play();
            try {
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            audioClip.stop();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
class GetTime implements Runnable {
    private JLabel timeLabel;
    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }
    @Override
    public void run() {
        while (true) {
            Date date = new Date();
            SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");
            timeLabel.setText((sf.format(date)));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}