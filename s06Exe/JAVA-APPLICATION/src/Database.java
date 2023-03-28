import java.sql.*;
import java.util.Scanner;


public class Database {
    private Scanner myScanner = new Scanner(System.in);    
    private Connection myConnection;
    private PreparedStatement insertStatement;
    private PreparedStatement selectStatement;
    private PreparedStatement deleteStatement;


    public Database() throws SQLException {

        // ## URL DATABASE ## //
        String url = "jdbc:postgresql://localhost:5432/my_database";

        // ## solicita dados de acesso ## //
        System.out.println("Enter admin username: ");
        String adminUsername = myScanner.nextLine();

        System.out.println("Enter admin password: ");
        String adminPassword = myScanner.nextLine();

        // ## create connection ## //
        myConnection = DriverManager.getConnection(url, adminUsername, adminPassword);
        
        
        insertStatement = myConnection.prepareStatement("INSERT INT clients VALUES(?, ?, ?, ?, ?)");  // ## CONSTRUTOR ## //
        selectStatement = myConnection.prepareStatement("SELECT * FROM clients");
        deleteStatement = myConnection.prepareStatement("DELETE * FROM clients WHERE username= ?");
    }
    public void insertOperation(){
        System.out.println("Enter cliente information");

        try {
            System.out.println("Enter client username: ");
            insertStatement.setString(1, myScanner.nextLine());

            System.out.println("Enter client fullname: ");
            insertStatement.setString(2, myScanner.nextLine());

            System.out.println("Enter client email: ");
            insertStatement.setString(3, myScanner.nextLine());
            
            System.out.println("Enter client phone: ");
            insertStatement.setString(4, myScanner.nextLine());

            System.out.println("Enter client age: ");
            insertStatement.setInt(5, myScanner.nextInt());

            int response = insertStatement.executeUpdate();
            System.out.println("Lines Inserted: "+response);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectOperation(){
        System.out.println("List of clients: ");

        try {
            ResultSet tableResult = selectStatement.executeQuery();

            while(tableResult.next()){
               // System.out.println(tableResultSet.getString(1));
                Client oneClient = new Client(
                    tableResult.getString(1).trim(),
                    tableResult.getString(2).trim(),
                    tableResult.getString(3).trim(),
                    tableResult.getString(4).trim(),
                    tableResult.getInt(5));

                System.out.println(oneClient.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteOperation(){
        System.out.println();
        try {
            String username = myScanner.nextLine();
            deleteStatement.setString(1, username);
            int results = deleteStatement.executeUpdate();
        
            if(results == 1){
                System.out.println(username+ " was removed from the clients table");
            }

        } catch (SQLException e) {
            System.out.println("Delete Error!");
        }
       
    }


}
