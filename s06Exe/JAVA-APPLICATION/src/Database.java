import java.sql.*;
import java.util.Scanner;

public class Database {
    private Scanner myScanner = new Scanner(System.in);    
    private Connection myConnection;
    private PreparedStatement insertStatement;
    private PreparedStatement selectStatement;
    private PreparedStatement selectUserStament;
    private PreparedStatement updateStatement;
    private PreparedStatement deleteStatement;
    private PreparedStatement countStatement;
    private PreparedStatement searchByNameStatement;


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
        
        
        insertStatement       = myConnection.prepareStatement("INSERT INT clients VALUES(?, ?, ?, ?, ?)");  // ## CONSTRUTOR ## //
        selectStatement       = myConnection.prepareStatement("SELECT * FROM clients LIMIT 5 OFFSET ?");
        selectUserStament     = myConnection.prepareStatement("SELECT * FROM clients WHERE username = ?");
        updateStatement       = myConnection.prepareStatement("UPDATE clients SET username = ?, fullname = ?, email = ?, phone = ?, age = ? WHERE username = ?");
        deleteStatement       = myConnection.prepareStatement("DELETE * FROM clients WHERE username= ?");
        countStatement        = myConnection.prepareStatement("SELECT count(*) FROM clients");
        searchByNameStatement = myConnection.prepareStatement("SELECT * FROM clients WHERE LOWER(fullname) LIKE LOWER (?)");
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
        System.out.println("List of clients:");  

        int totalOfClients = totalOfClients();
        System.out.println("Total of clients in database: "+totalOfClients);

        int numberOfPages = totalOfPages(totalOfClients);

        for (int page = 0;  page < numberOfPages; page++) {

        try {
                selectStatement.setInt(1, 5 * page);
                ResultSet tableResult = selectStatement.executeQuery();
                printTableRows(tableResult);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Page "+(page + 1)+"/"+numberOfPages);
        if(page +1 != numberOfPages){
            System.out.println("Press Enter fro the next Page");
            System.out.println();
            myScanner.nextLine();
        }
    }

        }

      
    public void updateOperation(){
        System.out.println("Enter the username of the client to be updated: ");
        Client updateClient = null;
        String username = null;
       
        // ## verifica se já existe o nome ## //
        try {
            username = myScanner.nextLine();
            selectUserStament.setString(1, username);
            ResultSet clientInfo = selectUserStament.executeQuery();

            if(clientInfo.next()){
                updateClient = new Client(
                    clientInfo.getString(1).trim(),
                    clientInfo.getString(2).trim(),
                    clientInfo.getString(3).trim(),
                    clientInfo.getString(4).trim(),
                    clientInfo.getInt   (5));      
                    
                    System.out.println(updateClient.toString());
            }else {
                System.out.println("A client with the username "+username+" doesn't exists");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        Boolean continueOperation = false;

        System.out.println();
        System.err.println("Enter the new username: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual username: "+updateClient.getUsername());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newUsername = myScanner.nextLine();
                if(newUsername != ""){
                    updateClient.setUsername(newUsername);
                    System.out.println("New username: "+updateClient.getUsername());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, username: "+updateClient.getUsername());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new username again: ");
            }
        }

        
        System.out.println();
        System.err.println("Enter the new username: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual username: "+updateClient.getUsername());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newUsername = myScanner.nextLine();
                if(newUsername != ""){
                    updateClient.setUsername(newUsername);
                    System.out.println("New username: "+updateClient.getUsername());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, username: "+updateClient.getUsername());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new username again: ");
            }
        }
        
        System.out.println();
        System.err.println("Enter the new fullname: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual fullname: "+updateClient.getFullname());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newFullname = myScanner.nextLine();
                if(newFullname != ""){
                    updateClient.setFullname(newFullname);
                    System.out.println("New fullname: "+updateClient.getFullname());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, fullname: "+updateClient.getFullname());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new fullname again: ");
            }
        }
    
        System.out.println();
        System.err.println("Enter the email: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual email: "+updateClient.getEmail());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newEmail = myScanner.nextLine();
                if(newEmail != ""){
                    updateClient.setEmail(newEmail);
                    System.out.println("New email: "+updateClient.getEmail());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, email: "+updateClient.getEmail());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new email again: ");
            }
        }
            
        System.out.println();
        System.err.println("Enter the phone: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual phone: "+updateClient.getPhone());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newPhone = myScanner.nextLine();
                if(newPhone != ""){
                    updateClient.setPhone(newPhone);
                    System.out.println("New phone: "+updateClient.getPhone());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, phone: "+updateClient.getPhone());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new phone again: ");
            }
        }

        System.out.println();
        System.err.println("Enter the age: ");
        System.out.println("Leave it blank for no alteration");
        System.out.println("Actual age: "+updateClient.getAge());

        continueOperation = false;
        while(!continueOperation == false){
            try {
                String newAge = myScanner.nextLine();
                if(newAge != ""){
                    updateClient.setAge(Integer.parseInt(newAge));
                    System.out.println("New age: "+updateClient.getAge());
                    continueOperation = true;
                }else {
                    System.out.println("No alteration, age: "+updateClient.getAge());
                    continueOperation = true;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Try to input the new age again: ");
            }
        }
        
        System.out.println();
        System.out.println("Update client: "+username+" Y/N");
        try {
                    
        String choice = myScanner.nextLine();
        if(choice.equals("Y") || choice.equals("y")){
            updateStatement.setString(1, updateClient.getUsername());
            updateStatement.setString(2, updateClient.getFullname());
            updateStatement.setString(3, updateClient.getEmail());
            updateStatement.setString(4, updateClient.getPhone());
            updateStatement.setInt(5, updateClient.getAge());
//           updateStatement.setString(6, username());

            int results = updateStatement.executeUpdate();
            if(results == 1){
                System.out.println("1 row updated!");
            }
        }else {
            System.out.println("Update Canceled!");
        }
        } catch (Exception e) {
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

    public int totalOfClients(){  

        int totalOfClients = 0;
        try {
            ResultSet countResult = countStatement.executeQuery();

            if(countResult.next());
                totalOfClients = countResult.getInt(1);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }   
        return totalOfClients;
    }  
    
    public static int totalOfPages(int totalOfClients){
        int numberOfPages = 0;
        if(totalOfClients % 5 == 0){
            numberOfPages = (totalOfClients/5);
        }else{
            numberOfPages = (totalOfClients/5);
        }
        return numberOfPages;
    }
    
    public void searchOperation(){
        try {
            System.out.println("Type your search: ");
            String searchValue = myScanner.nextLine();
            searchByNameStatement.setString(1, "%"+searchValue+"%");
            ResultSet searchResults = searchByNameStatement.executeQuery();
            printTableRows(searchResults);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
    }

    public static void printTableRows(ResultSet table) throws SQLException{
        
            while(table.next()){
               // System.out.println(tableResultSet.getString(1));
                Client oneClient = new Client(
                    table.getString(1).trim(),
                    table.getString(2).trim(),
                    table.getString(3).trim(),
                    table.getString(4).trim(),
                    table.getInt   (5));

                System.out.println(oneClient.toString());
        }
    }
}
