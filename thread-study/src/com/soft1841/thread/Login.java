package com.soft1841.thread;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {
    JButton login = new JButton("登录");
    JButton exit = new JButton("退出");
    JLabel name = new JLabel("用户名：");
    JLabel password = new JLabel("密码：");
    JTextField JName = new JTextField(10);
    JPasswordField JPassword = new JPasswordField(10);
    public Login() {
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(3, 2));

        name.setHorizontalAlignment(SwingConstants.RIGHT);
        password.setHorizontalAlignment(SwingConstants.RIGHT);

        jp.add(name);
        jp.add(JName);
        jp.add(password);
        jp.add(JPassword);
        jp.add(login);
        jp.add(exit);

        login.addActionListener(this);
        exit.addActionListener(this);

        this.add(jp, BorderLayout.CENTER);

        this.setTitle("登录窗口");
        this.setLocation(300, 300);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == exit) {
            int i = JOptionPane.showConfirmDialog(null, "确认要退出吗？", "确认", JOptionPane.YES_NO_OPTION);

            if (i == JOptionPane.YES_OPTION) ;
            System.exit(0);
        } else {
            if (JName.getText().equals("admin") && String.valueOf(JPassword.getPassword()).equals("admin")) {
                JOptionPane.showMessageDialog(null, "登录成功");

                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "用户或密码错误！请重新登录！");

                JName.setText("");
                JPassword.setText("");
            }
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Login();
    }
}