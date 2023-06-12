package Lab6;
import java.sql.*;

public class ConnectDB {
    static Connection conn;
    static Statement stmt=null;

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
    void closeAll(){
        try {
            stmt.close();
            conn.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ConnectDB db1 = new ConnectDB();
        db1.createTable();
        db1.closeAll();
    }
}
