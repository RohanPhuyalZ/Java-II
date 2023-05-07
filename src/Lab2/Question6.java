package Lab2;

import java.awt.*;

public class Question6 {
    Question6(){
        Frame frame = new Frame();
        frame.setSize(600,600);
        List list = new List(7,true);
        Panel panel = new Panel();
        Label l1= new Label("select your fav sport from thhe list",Label.RIGHT);
        list.add("Badminton");
        list.add("Hockey");
        list.add("Tennis");
        list.add("Football");
        list.add("Cricket");
        list.add("Formula One");
        list.add("Rugby");
        frame.setLayout(new FlowLayout());
        frame.add(l1);
        panel.add(list);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question6();
    }
}
