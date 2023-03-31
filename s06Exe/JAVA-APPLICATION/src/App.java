import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Database myDatabase = null;

        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("########## WELCOME TO DATABASE CRUD ##########");
        System.out.println();

        while(myDatabase == null){
            try {
                myDatabase = new Database();
            } catch (SQLException e) {
                System.out.println(e.getMessage());

                System.out.println("Try again? Y/N");
                char tryAgain = myScanner.nextLine().charAt(0);

                if(tryAgain == 'n' || tryAgain == 'N'){
                    System.exit(0);
                }
            }
        }

        // ## connection ## //
        System.out.println("Connected");
        System.out.println();

        boolean exitProgram = false;

        while(!exitProgram){
            System.out.println("Select a option: ");
            System.out.println("-----------------");
            System.out.println("C - Create");
            System.out.println("R - Read");
            System.out.println("U - Update");
            System.out.println("D - Delete");
            System.out.println("S - Search");
            System.out.println("0 - Exit");
            System.out.println("-----------------");
            System.out.println();

            char option = myScanner.nextLine().charAt(0);

            switch(option){
                case 'c':
                case 'C':
                    System.out.println("Selected: C - Create");
                    myDatabase.insertOperation();
                    break;
                case 'r':
                case 'R':
                    System.out.println("Selected: R - Read");
                    myDatabase.selectOperation();
                    break;
                case 'u':
                case 'U':
                    System.out.println("Selected: U - Update");
                    myDatabase.updateOperation();
                    break;
                case 'd':
                case 'D':
                    System.out.println("Selected: D - Delete");
                    myDatabase.deleteOperation();
                    break;
                case 's':
                case 'S':
                    System.out.println("Selected: S - Search");
                    myDatabase.searchOperation();
                    break;
                case '0':
                    System.out.println("Selected: 0 - Exit");
                    break;
                default:
                    System.out.println("Selected: "+option+"- Invalid");
                    break;
            }

            System.out.println();
            System.out.println("###############################");
            System.out.println("Press Enter to continue...");
            myScanner.nextLine();  
        }
        myScanner.close();
    }
}