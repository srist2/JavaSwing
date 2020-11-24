package pkg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_bg = new JLabel();
    JLabel label_airplane = new JLabel();
    JTextArea jTextArea_A = new JTextArea();
    int x = 50, y = 500;

    //构造方法
    public App() {
        jTextArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    y -= 10;
                    label_airplane.setBounds(x, y, 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    y += 10;
                    label_airplane.setBounds(x, y, 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x -= 10;
                    label_airplane.setBounds(x, y, 64, 64);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x += 10;
                    label_airplane.setBounds(x, y, 64, 64);
                }
            }
        });
    }

    //显示窗体方法
    void go() {
        JFrame frame = new JFrame("TestGUI");

        jTextArea_A.setBounds(100, 700, 300, 100);
        jTextArea_A.setText("飞机控制台");
        jTextArea_A.setBackground(Color.pink);


        java.net.URL img_airplane = App.class.getResource("plane3.png");
        label_airplane.setIcon(new ImageIcon(img_airplane));
        label_airplane.setBounds(50, 500, 64, 64);

        java.net.URL img_url = App.class.getResource("background.png");
        label_bg.setIcon(new ImageIcon(img_url));
        label_bg.setBounds(0, 0, 986, 1648);

        myPanel.setLayout(null);
        myPanel.add(jTextArea_A);
        myPanel.add(label_airplane);
        myPanel.add(label_bg);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 900);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
