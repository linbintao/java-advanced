package com.soft1841.gui;

import javax.swing.*;

public class CloudMusicFrame {
    private JPanel mianPanel;
    private JPanel leftPanel;
    private JButton 搜索Button;
    private JButton 发现Button;
    private JButton MVButton;
    private JButton 朋友Button;
    private JPanel centerPanel;
    private JLabel bottomLabel;
    private JLabel aa;
    private JPanel bbb;
    private JLabel music1;
    private JLabel music2;
    private JLabel music3;
    private JLabel music4;
    private JLabel music5;

    public static void main(String[] args) throws Exception{
        String lookAndFeel =UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("CloudMusicFrame");
        frame.setContentPane(new CloudMusicFrame().mianPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //全屏
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
