package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Question1 {
    JFrame frame;
    JLabel l1,l2;
    JButton b1;
    JPanel panel;
    JTextField t1,t2;
    Question1(){
        frame = new JFrame("Prime Number Test");
         l1 = new JLabel("Number");
         l2 = new JLabel("Prime");
         b1 = new JButton("Check");
        frame.setSize(400,200);
        frame.setLayout(new GridLayout(2,1));
         panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
         t1 = new JTextField();
         t2 = new JTextField();
        t2.setEnabled(false);
        frame.add(panel);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        frame.add(b1);
        b1.addActionListener(new innerClass());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class innerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(t1.getText());
            boolean flag=false;
            for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                t2.setText("No");
            }else{
                t2.setText("Yes");
            }
        }
    }
    public static void main(String[] args) {
        new Question1();
    }
}
