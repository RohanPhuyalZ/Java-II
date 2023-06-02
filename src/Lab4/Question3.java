package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question3 {
    JFrame frame;
    JLabel l1,l2;
    JButton b1;
    JTextField t1;
    Question3(){
        frame = new JFrame("Armstrong");
        l1 = new JLabel("Number");
        l2 = new JLabel("                     ");
        b1 = new JButton("Check");
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());
        t1 = new JTextField(8);
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(l2);
        b1.addActionListener(new innerClass());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    class innerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num = Integer.parseInt(t1.getText());
            int rev=0;
            int rem=0;
            int arm=num;
            while(num!=0){
                rem=num%10;
                rev=rev+(rem*rem*rem);
                num/=10;
            }
            if(rev==arm){
                l2.setText("It's Armstrong");
            }else{
                l2.setText("It's not Armstrong");
            }
        }
    }
    public static void main(String[] args) {
        new Question3();
    }
}
