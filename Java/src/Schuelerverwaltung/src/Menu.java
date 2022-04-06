import java.util.Scanner;
import java.util.Random;

public class Menu {

    //Write für create User
    private ReadWrite write;

    //private Shop s1;

    //Scanner für die Eingabe 
    Scanner sc = new Scanner(System.in);

    //Random für die UserID
    Random rand = new Random();
    int userIDrandom = 999;

    //breakline
    public void breakLine(){
        System.out.println("------------------");
    }


    //Methode für Menu start
    public String menustart(){
        breakLine();
        System.out.println("(1) - Anmelden");
        System.out.println("(2) - Account erstellen");
        breakLine();

        return sc.next();
    }


    //Erstellt einen neuen User
    public User createUser(){

        write = new ReadWrite();
        breakLine();
        System.out.println("Ertselle einen Username");
        String pUsername = sc.next();

        System.out.println("Erstellen Sie ein Passwort");
        String pPassword = sc.next();
        

        System.out.println("Gebe deinen richtigen Namen ein:"); 
        String pName = sc.next();
   
        System.out.println("Gebe dein Alter ein:");
        int pAge = sc.nextInt(); 
        
        //UserID wird random erstellt von 999
        int pUserID = rand.nextInt(userIDrandom);
            
        //User bekommt Startgeld
        double pMoney = 1000.0;
            
        User user = new User(pName, pAge, pUsername, pPassword, pMoney, pUserID);

        System.out.println("Dein Username: " + user.getUsername());
        breakLine();
        System.out.println("Dein Password: " + user.getPassword());
        breakLine();
        System.out.println("Dein Name: " + user.getName());
        breakLine();
        System.out.println("Dein Alter: " + user.getAge());
        breakLine();
        System.out.println("Dein Guthaben: " + user.getMoney());
        breakLine();
        System.out.println("Deine ID: " + user.getUserID());

        System.out.println("User erstellt!");
        return user;        
    }  

    
    //Hauptmenue des Programmes
    public int showMenu(){
        breakLine();
        System.out.println("(1) - Inventar");
        System.out.println("(2) - Einkaufszentrum");
        System.out.println("(3) - Liquide Mittel überprüfen/hinzufügen");
        System.out.println("(4) - Benutzerprofil überprüfen/bearbeiten");
        System.out.println("(5) - Ausloggen/Abmelden");
        breakLine();

        return sc.nextInt();
    }


    public void showMoney(User pUser){
        breakLine();
        System.out.println("Dein Geld beträgt: " + pUser.getMoney());
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");
        System.out.println("Drücke -H- um geld hinzuzufügen");
        breakLine();

        String input = sc.next();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }else if(input.toLowerCase().equals("h")){
            System.out.println("Wie wiel geld möchtest du hinzufügen? ");
            double pMoney = sc.nextDouble();
            breakLine();
            pUser.addMoney(pMoney);
        }else if(input.equals("69")){
            pUser.setMoney(pUser.getMoney() + 100000.0);
            System.out.println("HAHA NICE!");
        }else{
            System.out.println("Falsche Eingabe!");
        }
    }
    
 
    public void showProfile(User pUser){
        breakLine();
        System.out.println("Dein Username: " + pUser.getUsername());
        System.out.println("Dein Passwort: " + pUser.getPassword());
        System.out.println("Deine User ID " + pUser.getUserID());
        System.out.println("Dein Alter " + pUser.getAge() );
        breakLine();

        System.out.println("Drücke -B- um deinen Benutzernamen zu ändern");
        System.out.println("Drücke -P- um dein Passwort zu ändern");
        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");
        breakLine();

        String input = sc.next();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }else if(input.toLowerCase().equals("p")){
            System.out.println("Gebe dein neues Passwort ein: ");
            String pPassword = sc.next();
            breakLine();
            pUser.changePassword(pPassword);
        }else if(input.toLowerCase().equals("b")){
            System.out.println("Gebe dein neuen Benutzernamen ein: ");
            String pUsername = sc.next();
            breakLine();
            pUser.changeUsername(pUsername);
        }else{
            System.out.println("Falsche Eingabe!");
        }
    }

    public void logOut(Cardmanagement pCardmanagement){
        breakLine();
        System.out.println("Sie werden abgemeldet.......................");
        pCardmanagement.logOut();
        breakLine();
        System.exit(0);
    } 


    public void menumain(Cardmanagement pCardmanagement){
        while(pCardmanagement.getLoggedIN() == true){
           // s1 = new Shop();
            switch(showMenu()){
                case 1: System.out.println("Jajajaj");
                        break;

                case 2: /*s1.showShop(); */System.out.println("Shop");
                        break;

                case 3: showMoney(pCardmanagement.getUser());
                        break;

                case 4: showProfile(pCardmanagement.getUser());
                        break;

                case 5: logOut(pCardmanagement);
                        break;

                default: System.out.println("Falsche Eingbe!");
                        
            }
        }
    }
} 