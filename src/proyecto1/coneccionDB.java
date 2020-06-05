
package proyecto1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class coneccionDB {
    
    private static coneccionDB con=null;

    public static coneccionDB getInstance(){
        if(con==null)
            con=new coneccionDB();
        return con;
    }
    
    //conneccion a postgresql
   private coneccionDB(){
        String urlDatabase= "jdbc:postgresql//localhost:5432/";
        try{
            Class.forName("org.postgresql.Driver*");
            con = (coneccionDB) DriverManager.getConnection(urlDatabase, "postgres", "password");
        } catch (Exception ex) {
            System.out.println("Ocurrio un problema : " + e.getMessage());
        }
        System.out.println("La connexion se realizo sin problemas");
    }

    boolean execute(String sql) {
       boolean res=false;
       try{
           Statement st = con.createStatement();
           st.execute(sql);
           res=true;
       }catch (SQLException ex){
           Logger.getLogger(coneccionDB.class.getName()).log(Level.SEVERE, null, ex);
       }
        return res;
    }
    
}
