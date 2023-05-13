package Lab2;

import java.awt.*;

public class Question5 {
    Question5(){
        Frame frame = new Frame();
        frame.setSize(600,600);
        List list = new List();
        Panel panel = new Panel();
        Label l1= new Label("choose the planet",Label.RIGHT);
        list.add("Mercury");
        list.add("Venus");
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Saturn");
        list.add("Uranus");
        list.add("Neptune");
        frame.setLayout(new FlowLayout());
        frame.add(l1);
        panel.add(list);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question5();
    }
}
