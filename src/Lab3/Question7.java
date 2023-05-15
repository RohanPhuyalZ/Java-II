package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question7 {
    Question7(){
        Frame frame = new Frame();
        frame.setSize(600,200);
        frame.setLayout(new FlowLayout());

        Label l1 = new Label("Number");
        Label l2 = new Label("Factorial");
        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        t2.setEnabled(false);
        Button b1 = new Button("Calculate");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(t1.getText());
                int result = fact(number);
                t2.setText(""+result);
            }
        });
        frame.add(l1);
        frame.add(t1);
        frame.add(b1);
        frame.add(l2);
        frame.add(t2);
        frame.setVisible(true);
    }
    int fact(int number){
        if(number==0||number==1){
            return 1;
        }else{
            return number * fact(number-1);
        }
    }
    public static void main(String[] args) {
        new Question7();
    }
}
