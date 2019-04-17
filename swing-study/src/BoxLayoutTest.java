import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;

/**
 * BoxLayout布局
 * @author 林
 * 2019.0.29
 */
public class BoxLayoutTest extends JFrame {
    public BoxLayoutTest(){
        init();
        setTitle("BoxLayout布局");
        setSize(400,700);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        //重新设置窗体布局为水平，垂直间距
        setLayout(new BorderLayout(20,20));
        //顶部面板
        JPanel topPanel = new JPanel();
        //对topPanel进行水平方向排列的BoxLayout布局
        BoxLayout boxLayout = new BoxLayout(topPanel,BoxLayout.X_AXIS);
        topPanel.setLayout(boxLayout);
        //topPanel设置背景色和大小
        topPanel.setBackground(new Color(90, 221, 217));
        topPanel.setPreferredSize(new Dimension(400,100));
        //左侧按钮
        JButton leftButton = new JButton("扫一扫");
        leftButton.setPreferredSize(new Dimension(80,30));
        topPanel.add(leftButton);
        //加入一个glue，占两个按钮之间的空间
        topPanel.add(Box.createHorizontalGlue());
        //右侧按钮
        JButton rightButton = new JButton("会员码");
        rightButton.setPreferredSize(new Dimension(80,30));
        topPanel.add(rightButton);
        //topPanel加入窗体顶部
        add(topPanel,BorderLayout.NORTH);
        //中间的middlePanel面板，垂直方向的BoxLayout布局
        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new BoxLayout(middlePanel,BoxLayout.Y_AXIS));
        //创建三个面板，加入middlePanel
        for (int i = 0; i < 3; i++){
            JPanel jPanel = new JPanel();
            jPanel.setPreferredSize(new Dimension(400,120));
            jPanel.setBackground(new Color(81, 210, 35));
            //分别将每次创建的面板，加入middlePanel
            middlePanel.add(jPanel);
            //每个加入面板下加入一个垂直方向的Strut，空出一点位置
            middlePanel.add(Box.createVerticalStrut(20));
        }
        //最后将middlePanel加入窗体的中间区域
        add(middlePanel,BorderLayout.CENTER);

    }
    public static void main(String[] args) {
        try{
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }catch (Exception e){
            e.printStackTrace();
        }
        new BoxLayoutTest();
    }
}
