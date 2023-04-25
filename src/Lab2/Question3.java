package Lab2;

import java.awt.*;

public class Question3 {
    Question3(){
        Frame frame = new Frame("CheckBox Demo");
        frame.setLayout(new GridLayout(8,1));
        Label l1= new Label("Choose program to enroll");
        Label l2= new Label("Payment");
        Checkbox c = new Checkbox("C");
        Checkbox java = new Checkbox("Java");
        Checkbox html = new Checkbox("HTML");
        Checkbox php = new Checkbox("PHP");
        CheckboxGroup c1= new CheckboxGroup();
        Checkbox now = new Checkbox("Now",c1,false);
        Checkbox later = new Checkbox("Later",c1,false);
        frame.add(l1);
        frame.add(c);
        frame.add(java);
        frame.add(html);
        frame.add(php);
        frame.add(l2);
        frame.add(now);
        frame.add(later);
        frame.setSize(600,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Question3 q3 = new Question3();
    }
}
