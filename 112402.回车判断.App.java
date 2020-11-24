import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea jTextArea_A = new JTextArea();
    JTextArea jTextArea_B = new JTextArea();
    //构造方法
    public App() {
        jTextArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (jTextArea_A.getText().equals("多功能土豆")) {
                        jTextArea_B.append("输入成功\n");
                    } else {
                        jTextArea_B.append("输入失败\n");
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    jTextArea_B.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");

        jTextArea_A.setBounds(100, 100, 300, 100);
        jTextArea_A.setBackground(Color.pink);

        jTextArea_B.setBounds(100, 300, 300, 100);
        jTextArea_B.setBackground(Color.ORANGE);

        myPanel.setLayout(null);
        myPanel.add(label_txt);
        myPanel.add(jTextArea_A);
        myPanel.add(jTextArea_B);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
