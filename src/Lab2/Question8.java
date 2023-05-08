package Lab2;

import java.awt.*;

public class Question8 {
    Question8(){
        Frame frame = new Frame();
        frame.setSize(400,250);
        frame.setLayout(new GridLayout(4, 2));
        Label l1 = new Label("First Number: ");
        Label l2 = new Label("Second Number: ");
        Label l3 = new Label("Result: ");
        TextField t1= new TextField();
        TextField t2= new TextField();
        TextField t3= new TextField();
        Button b1= new Button("+");
        Button b2= new Button("-");
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(b1);
        frame.add(b2);

        /* Event Handling Not Needed Currently*/
        //code
        /* Event Handling Finished*/

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question8();
    }
}
