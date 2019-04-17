import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;


public class JFileChooserTest extends JFrame implements ActionListener {
    private JButton chooserbtn;
    private JLabel pathLable;
    private JFileChooser fileChooser;

    public JFileChooserTest() {
        init();
        setTitle("CardLayout");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


    private void init() {
        chooserbtn = new JButton("选择文件");
        pathLable = new JLabel("暂无选择");
        Font font = new Font("微软雅黑", Font.BOLD, 26);
        chooserbtn.addActionListener(this);
        pathLable.setFont(font);
        add(pathLable);
        add(chooserbtn, BorderLayout.NORTH);

    }


    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new JFileChooserTest();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("."));
        fileChooser.setCurrentDirectory(new File("D:\\"));
        //打开对话框
        int result = fileChooser.showOpenDialog(null);
        //点击确认按钮
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            //将file的绝对路径放入窗体中间
            //   pathLable.setText(file.getAbsolutePath());
            try {
                FileInputStream inputStream = new FileInputStream(file);
                Scanner scanner = new Scanner(inputStream);


            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            }
        }
    }
}

