package adoptapet.dawi.com.adoptapet.util;

import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConexion {

   // public String direccionIP = "" ;

    public static void main(String[] args) throws Exception {
        DbConexion con = new DbConexion();
        con.getConnection();

    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
            //connection = DriverManager.getConnection("jdbc:mysql://192.168.0.194:41972/db_adoptapets","imori","Oracle");
            connection = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.33;databasename=bd_adoptapets;user="";password=""");
        //"jdbc:jtds:sqlserver://192.168.56.1;databaseName=db_adoptapets;user=sa;password=N30r4b4r"
         Log.e("Conexion",connection.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
