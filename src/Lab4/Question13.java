package Lab4;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class Question13 {
    Question13(){
        JFrame f = new JFrame();
        f.setSize(600,600);
        String []head = {"ID","Name","Product","Price in $"};
        Object [][]data = {
                {"1234","John","pencil","10"},
                {"4382","Mirian","pen","11"},
                {"2345","Katy","chair","253"},
                {"6334","Agnes","table","456"},
                {"1177","Stanley","flower","25"}
        };
        JTable table = new JTable(data,head);
        JScrollPane pane = new JScrollPane(table);
        pane.setPreferredSize(new Dimension(400,50));
        f.add(pane);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Question13();
    }
}
