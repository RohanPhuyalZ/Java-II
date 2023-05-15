package Lab3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question6 implements ActionListener {
    Frame frame;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    Panel panel,panel2;
    Question6(){
        frame = new Frame("Calculate");
        panel = new Panel();
        panel2 = new Panel();
        panel.setLayout(new GridLayout(3,2));
        panel2.setLayout(new FlowLayout());
        frame.setLayout(new GridLayout(2, 1));
        l1= new Label("Number 1");
        l2= new Label("Number 2");
        l3= new Label("Result");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        t3.setEnabled(false);
        b1= new Button("+");
        b2= new Button("-");
        b3= new Button("*");
        b4= new Button("/");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        frame.add(panel);
        frame.add(panel2);
        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);
        panel.add(l3);
        panel.add(t3);
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question6();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="+"){
            int firstNumber = Integer.parseInt(t1.getText());
            int secondNumber = Integer.parseInt(t2.getText());
            t3.setText(""+(firstNumber+secondNumber));
        }
        else if(e.getActionCommand()=="-"){
            int firstNumber = Integer.parseInt(t1.getText());
            int secondNumber = Integer.parseInt(t2.getText());
            t3.setText(""+(firstNumber-secondNumber));
        }else if(e.getActionCommand()=="*"){
            int firstNumber = Integer.parseInt(t1.getText());
            int secondNumber = Integer.parseInt(t2.getText());
            t3.setText(""+(firstNumber*secondNumber));
        }else if(e.getActionCommand()=="/"){
            int firstNumber = Integer.parseInt(t1.getText());
            int secondNumber = Integer.parseInt(t2.getText());
            t3.setText(""+(firstNumber/secondNumber));
        }
    }
}
