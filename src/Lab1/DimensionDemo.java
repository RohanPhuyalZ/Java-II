package Lab1;

import java.awt.*;

public class DimensionDemo {
    DimensionDemo(){
        Frame frame = new Frame("My First GUI");
        Dimension d1 = new Dimension(600,600);
        frame.setSize(d1);
//        d1.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new DimensionDemo();
    }
}
