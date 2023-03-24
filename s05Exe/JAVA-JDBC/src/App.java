import java.sql.*;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn;
        String url = "jdbc:postgresql://localhost:5432/my_database";
        Properties proper = new Properties();
        proper.setProperty("user", "postgres");
        proper.setProperty("password", "*********************");
        proper.setProperty("ssl", "false");
        conn =  DriverManager.getConnection(url, proper);
        System.out.println("Conectado");
        //conection final

        Statement state = conn.createStatement();


        
        //  String mySqlCode = "CREATE TABLE clients " +
        //              "(" +
        //                  "username CHAR(20) PRIMARY KEY NOT NULL, " +
        //                  "fullname TEXT NOT NULL, " +
        //                  "email CHAR(50) NOT NULL, " +
        //                  "phone CHAR(15) NOT NULL, " +
        //                  "age INT NOT NULL " +
        //              ")";
        
        // state.executeUpdate(mySqlCode);
        // System.out.println("Tabela Criada");

        // String mySqlCode = "INSERT INTO clients VALUES('bigpac', 'Michael Jéssico', 'passinhobilliejen@dominio.com', '9876543210', '72')";
        // state.executeUpdate(mySqlCode);
        // System.out.println("Linha inserida"); 
        

            String mySqlCode = "SELECT * FROM clients";
            ResultSet tableResult = state.executeQuery(mySqlCode);
            System.out.println("Query Executada");

            while(tableResult.next()){
                String username = tableResult.getString("username");
                System.out.println("nome "+username);

        }
        state.close();
        conn.close(); 
    }
}
