package pkg;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel = new JPanel();
    JLabel label_score = new JLabel();
    JLabel label_ball = new JLabel();
    JLabel label_basket = new JLabel();
    int size = 68;
    int row=0, column=0;
    int score = 0;

    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    column--;
                    label_ball.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    column++;
                    label_ball.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    row--;
                    label_ball.setBounds(size * row, size * column,size,size);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    row++;
                    label_ball.setBounds(size * row, size * column,size,size);
                }
                if (label_ball.getX() == label_basket.getX() && label_ball.getY() == label_basket.getY()) {
                    int rdm = (int)(Math.random()*10);
                    int rdm2 = (int)(Math.random()*10);
                    score++;
                    label_basket.setBounds(size * rdm , size * rdm2, size, size);
                    label_score.setText("当前成绩：" + score);
                }
            }
        });

    }

    //显示窗体方法
    void go() {
        label_score.setBounds(0, 0, 200, 30);
        label_score.setText("当前成绩：0");
        myPanel.add(label_score);

        java.net.URL imgURL = App.class.getResource("image/ball.gif");
        label_ball.setIcon(new ImageIcon(imgURL));
        label_ball.setBounds(0, 0, size, size);
        myPanel.add(label_ball);

        java.net.URL imgBasket = App.class.getResource("image/basket2.gif");
        label_basket.setIcon(new ImageIcon(imgBasket));
        label_basket.setBounds(2 * size, 2 * size, size, size);
        myPanel.add(label_basket);

        myPanel.setFocusable(true);
        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1024, 768);
        //frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new App().go();
    }
}
