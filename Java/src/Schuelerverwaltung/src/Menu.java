import java.util.Scanner;
import java.util.Random;
public class Menu {

    //Scanner für die Eingabe 
    Scanner sc = new Scanner(System.in);
    String testUser = "test";

    //Random für die UserID
    Random rand = new Random();
    int userIDrandom = 999;


    public void breakLine(){
        System.out.println("------------------");
    }

    //Methode für die Komplette Menüführung
    public void menustart(){
        breakLine();
        System.out.println("");
        breakLine();
    }

    //Erstellt einen neuen User
    public User createUser(){
        breakLine();
        System.out.println("Gebe deinen richtigen Namen ein:"); 
        String pName = sc.nextLine();
    
        System.out.println("Gebe dein Alter ein:");
        int pAge = sc.nextInt();
        
        System.out.println("Ertselle einen Username");
        String pUsername = sc.nextLine();

        System.out.println("Erstellen Sie ein Passwort");
        String pPassword = sc.nextLine();

        //UserID wird random erstellt von 1000
        int pUserID = rand.nextInt(userIDrandom);
        System.out.println("Dein UserID lautet:" + pUserID);

        double pMoney = 100.00;
        System.out.println("Dein Geld beträgt:" + pMoney);
        breakLine();


        User testUser = new User (pName,pAge,pUsername,pPassword,pMoney,pUserID);
    }
    
    
    //Anmeldevorgang noch nicht ready
    public String logIn(){
        System.out.println("Gebe deinen Username ein:");
        
        String testUser = sc.next();

        return testUser;  
    }
    
    
    public Menu(){
        System.out.println("(1) - Inventar");
        System.out.println("(2) - Einkaufszentrum");
        System.out.println("(3) - Liquide Mittel überprüfen");
        System.out.println("(4) - Benutzerprofil überprüfen/bearbeiten");
        System.out.println("(5) - Ausloggen/Abmelden");

        int ScannerMenu = sc.nextInt();
        if(sc.equals("1")){
            showInventory();
        }
        else if(sc.equals("2")){
            showShop();
        }
        else if(sc.equals("3")){
            showMoney();
        }
        else if(sc.equals("4")){
            CheckProfile();
        }
        else if(sc.equals("1")){
            logOut();
        }

        
    }
    /*
    public Inventory showInventory(){

    }
    */
 
    public  String  checkProfile(){
        breakLine();
        System.out.println("Dein Account:");
        return testUser;
    }
    
    
}
