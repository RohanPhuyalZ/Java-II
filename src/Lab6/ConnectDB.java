package Lab6;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ConnectDB {
    static Connection conn;
    static Statement stmt=null;
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
        ph= new JLabel("PH");

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        ConnectDB db1 = new ConnectDB();
//        db1.createTable();
//        db1.insertIntoTable();
        db1.insertDBGUI();
        db1.closeAll();
    }
}
