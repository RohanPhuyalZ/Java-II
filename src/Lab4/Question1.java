package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Question1 {
    Question1(){
        JFrame frame = new JFrame("Prime Number Test");
        JLabel l1 = new JLabel("Number");
        JLabel l2 = new JLabel("Prime");
        JButton b1 = new JButton("Check");
        frame.setSize(400,200);
        frame.setLayout(new GridLayout(2,1));
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        t2.setEnabled(false);
        frame.add(panel);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
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
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question1();
    }
}
