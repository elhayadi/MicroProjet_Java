package mini_projet;
import java.sql.*;
public class DB {
    Connection con;
    Statement stm;
    ResultSet rst;
   public DB(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql:"
           + "//127.0.0.1:3306/cabinetmedicale","root","123");
           stm=con.createStatement();
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("Erreur de chargement de pilote:"+e);
        } 
   }
   
   public void close(DB db) throws SQLException{
       this.con.close();
   }
}



 
