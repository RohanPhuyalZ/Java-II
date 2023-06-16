package Lab6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ConnectDB {
    static Connection conn;
    static Statement stmt=null;
    static ResultSet rs = null;
    JFrame frame;
    JPanel panel;
    JLabel id,name,age,ph,add;
    JTextField tid,tname,tage,tph,tadd;
    JButton b1;
    JOptionPane option;

    ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_test";
            conn = DriverManager.getConnection(url,"root","");
            if(conn!=null){
                System.out.println("Connection Successfull");
            }else{
                System.out.println("CAnnot Connect");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    void createTable(){
        String sql= "CREATE TABLE User(" +
                "id int," +
                "name varchar(50)," +
                "age int," +
                "phone_number numeric(10)," +
                "address varchar(50)" +
                ");";
        try{
            if(conn!=null){
                stmt = conn.createStatement();
                int result = stmt.executeUpdate(sql);
                if(result!=-1){
                    System.out.println("Table Created Successfully");
                }else{
                    System.out.println("Could not create table. Please check SQL Syntax");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void insertIntoTable(){
        String sql = "INSERT INTO User " +
                "VALUES(1,'Rohan',20,9869457230,'Kavresthali')," +
                "(2,'Lee',21,9813369920,'Tyai Cheu ma')";
        try{
            if(conn!=null){
                stmt = conn.createStatement();
                int result = stmt.executeUpdate(sql);
                if(result!=-1){
                    System.out.println("Data Insert Successfully");
                }else{
                    System.out.println("Could not insert data. Please check SQL Syntax");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void closeAll(){
        try {
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void insertDBGUI(){
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(2,1));
        panel = new JPanel();
        panel.setLayout(new GridLayout(5,1));

        id= new JLabel("ID");
        name = new JLabel("Name");
        age = new JLabel("Age");
        ph= new JLabel("Phone Number");
        add= new JLabel("Address");
        tid= new JTextField(8);
        tname= new JTextField(8);
        tage= new JTextField(8);
        tph= new JTextField(8);
        tadd= new JTextField(8);
        b1 = new JButton("Add to DB");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tid.getText().isEmpty()||tname.getText().isEmpty()||tage.getText().isEmpty()||tph.getText().isEmpty()||tadd.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame, "Fill all fields");
                }else{
                    insertDataGUI();
                }
            }
        });

        panel.add(id);
        panel.add(tid);
        panel.add(name);
        panel.add(tname);
        panel.add(age);
        panel.add(tage);
        panel.add(ph);
        panel.add(tph);
        panel.add(add);
        panel.add(tadd);
        frame.add(panel);
        frame.add(b1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
     void insertDataGUI(){
         System.out.println(this.tid.getText());
        int tid=Integer.parseInt(this.tid.getText());
        String tname= this.tname.getText();
        int tage = Integer.parseInt(this.tage.getText());
        long tph = Long.parseLong(this.tph.getText());
        String tadd= this.tadd.getText();
        String sql = "INSERT INTO User " +
                "VALUES("+tid+",'"+tname+"',"+tage+","+tph+",'"+tadd+"')";
        try{
            if(conn!=null){
                stmt = conn.createStatement();
                int result = stmt.executeUpdate(sql);
                if(result!=-1){
                    JOptionPane.showMessageDialog(frame, "Insert Success");
                    System.out.println("Data Insert Successfully");
                }else{
                    JOptionPane.showMessageDialog(frame, "Cannot Insert");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void fetchData(){
        String sql = "SELECT * FROM User";
        try{
            if(conn!=null){
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sql);
                while(rs.next()){
                    System.out.println("id: "+rs.getInt(1)+"name: "+rs.getString(2)+"age: "+rs.getInt(3)+"phone_number: "+rs.getString(4)+"address: "+rs.getString(5));
                }
            }else{
                System.out.println("Cannot fetch");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ConnectDB db1 = new ConnectDB();
//        db1.createTable();
//        db1.insertIntoTable();
//        db1.insertDBGUI();
        db1.fetchData();
        db1.closeAll();
    }
}
