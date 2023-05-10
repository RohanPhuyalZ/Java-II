package Lab2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Question11 {
    Question11(){
        Frame frame = new Frame("Menu Demo");
        frame.setSize(520,300);
        frame.setLayout(new BorderLayout());
        MenuBar mb= new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu run = new Menu("Run");
        Menu source = new Menu("Source");
        Menu refactor = new Menu("Refactor");
        Menu navigate = new Menu("Navigate");
        Menu search = new Menu("Search");
        Menu project = new Menu("Project");
        Menu window = new Menu("Window");
        Menu help = new Menu("Help");
        MenuItem op= new MenuItem("Open Project");
        MenuItem cp= new MenuItem("Close Project");
        MenuItem ba= new MenuItem("Build All");
        MenuItem bp= new MenuItem("Build Project");
        mb.add(file);
        mb.add(edit);
        mb.add(run);
        mb.add(source);
        mb.add(refactor);
        mb.add(navigate);
        mb.add(search);
        mb.add(project);
        project.add(op);
        project.add(cp);
        project.add(ba);
        project.add(bp);
        mb.add(window);
        mb.add(help);
        frame.setMenuBar(mb);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Question11();
    }
}
