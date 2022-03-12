import java.util.Scanner;
import java.util.Random;
public class Menu {

    //Scanner für die Eingabe 
    Scanner sc = new Scanner(System.in);
    String testUser = "test";

    //Random für die UserID
    Random rand = new Random();
    int userIDrandom = 999;

    //breakline
    public void breakLine(){
        System.out.println("------------------");
    }


    //Methode für Menu start
    public void menustart(){
        breakLine();
        System.out.println("(1) - Anmelden");
        System.out.println("(2) - Konto erstellen");
        breakLine();

        int ScannerMenu = sc.nextInt();
        if(sc.equals("1")){
           logIn();
        }
        else if(sc.equals("2")){
            createUser();
        }
    }

    
    //Anmelden
    public String logIn(){
        breakLine();
        System.out.println("Bitte geben Sie ihr Benutzernamen ein: ");
        //Hier Scanner einfügen der mit Datenbank überprüft
        System.out.println("Bitte geben Sie ihr Passwort ein: ");
        //Hier Scanner einfügen der mit Datenbank überprüft
        breakLine();

        //Hier einfügen: Wenn anmeldung erfolgreich dann öffne Menu, wenn nicht erfolgreich wiederhole logIn()
        
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

        //UserID wird random erstellt von 999
        int pUserID = rand.nextInt(userIDrandom);
        System.out.println("Dein UserID lautet:" + pUserID);

        //User bekommt Startgeld
        double pMoney = 100.00;
        System.out.println("Dein Geld beträgt:" + pMoney);
        breakLine();

        //Hier einfügen: Wenn Erstellung erfogreich dann öffne Menue, wenn nicht wiederhole createUser()


        User testUser = new User (pName,pAge,pUsername,pPassword,pUserID,pMoney);
        return testUser;
    }
    
    
    //Hauptmenue des Programmes
    public Menu showMenu(){
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
        else if(sc.equals("L")){
            logOut();
        }
        else if(sc.equals("l")){
            logOut();
        }

        
    }

    /*
    public Inventory showInventory(){
        System.out.println("(1) - " + pokemon1);
        System.out.println("(2) - " + pokemon2);
        System.out.println("(3) - " + pokemon3);
        System.out.println("(4) - " + pokemon4);
        System.out.println("(5) - " + pokemon5);
        System.out.println("(6) - " + pokemon6);
        System.out.println("(7) - " + pokemon7);
        System.out.println("(8) - " + pokemon8);
        System.out.println("(9) - " + pokemon9);
        System.out.println("(10) - " + pokemon10);
        System.out.println("(11) - " + pokemon11);
        System.out.println("(12) - " + pokemon12);
        System.out.println("(13) - " + pokemon13);
        System.out.println("(14) - " + pokemon14);
        System.out.println("(15) - " + pokemon15);
        System.out.println("(16) - " + pokemon16);
        System.out.println("(17) - " + pokemon17);
        System.out.println("(18) - " + pokemon18);
        System.out.println("(19) - " + pokemon19);
        System.out.println("(20) - " + pokemon20);

        if(sc.equals("1")){
            
        }
        else if(sc.equals("2")){
        
        }
        else if(sc.equals("3")){
            
        }
        else if(sc.equals("4")){
            
        }
        else if(sc.equals("5")){
            
        }
        else if(sc.equals("6")){
        
        }
        else if(sc.equals("7")){
            
        }
        else if(sc.equals("8")){
            
        }
        else if(sc.equals("9")){
            
        }
        else if(sc.equals("10")){
        
        }
        else if(sc.equals("11")){
            
        }
        else if(sc.equals("12")){
            
        }
        else if(sc.equals("13")){
            
        }
        else if(sc.equals("14")){
            
        }
        else if(sc.equals("15")){
            
        }
        else if(sc.equals("16")){
        
        }
        else if(sc.equals("17")){
            
        }
        else if(sc.equals("18")){
            
        }
        else if(sc.equals("19")){
            
        }
        else if(sc.equals("20")){
            
        }
    }
    */
    
    /*
    public Shop showShop(){
        System.out.println("(1) - " + pokemon1);
        System.out.println("(2) - " + pokemon2);
        System.out.println("(3) - " + pokemon3);
        System.out.println("(4) - " + pokemon4);
        System.out.println("(5) - " + pokemon5);

        if(sc.equals("1")){
            
        }
        else if(sc.equals("2")){
        
        }
        else if(sc.equals("3")){
            
        }
        else if(sc.equals("4")){
            
        }
        else if(sc.equals("5")){
            
        }
        
    }
    */

    public showMoney(double pMoney){
        breakLine();
        //Hier Geld
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.nextLine();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }
    }
    
 
    public void checkProfile(){
        breakLine();
        System.out.println("Dein Username: " + User1);
        System.out.println("Dein Passwort: " + UserPassword1);
        System.out.println("Deine User ID " + UserId1);
        System.out.println("Dein Alter " + UserAge1);
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.nextLine();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }

    }

    public void logOut(){
        breakLine();
        System.out.println("Sie werden abgemeldet.......................");
        breakLine();

        menustart();
    }   
}