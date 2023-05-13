package Lab2;

import java.awt.*;

public class Question9 {
    Question9(){
        Frame frame = new Frame();
        frame.setSize(400,400);
        frame.setLayout(new BorderLayout());
        Label l1 = new Label("Control in Action: TextArea",Label.CENTER);
        Label l2 = new Label("Comments");
        TextArea ta= new TextArea("We are demonstrating TextArea");
        Button b1 = new Button("Show");
        frame.add(l1,BorderLayout.NORTH);
        frame.add(l2,BorderLayout.WEST);
        frame.add(ta,BorderLayout.CENTER);
        frame.add(b1,BorderLayout.EAST);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question9();
    }
}
