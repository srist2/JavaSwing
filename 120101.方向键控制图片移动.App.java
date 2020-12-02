package pkg;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_txt = new JLabel();
    JLabel label_plane = new JLabel();
    int size = 64;
    int row=0, column=0;

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    column--;
                    label_plane.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    column++;
                    label_plane.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    row--;
                    label_plane.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    row++;
                    label_plane.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    System.out.println("biuBiubiuBiu");
                }
            }
        });

    }

    //显示窗体方法
    void go() {
        label_txt.setBounds(0, 0, 200, 30);
        myPanel.add(label_txt);

        java.net.URL imgURL = App.class.getResource("image/plane001.gif");
        label_plane.setIcon(new ImageIcon(imgURL));
        label_plane.setBounds(0, 50, size, size);
        myPanel.add(label_plane);

        myPanel.setFocusable(true);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 512, 720);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
