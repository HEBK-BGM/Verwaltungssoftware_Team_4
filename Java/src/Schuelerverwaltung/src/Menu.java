import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

import java.util.Random;

import java.io.File;  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
        String pPassword;
        pPassword = sc.next();
        

        System.out.println("Gebe deinen richtigen Namen ein:"); 
        String pName = sc.next();
   
        System.out.println("Gebe dein Alter ein:");
        int pAge = sc.nextInt(); 
        
        //UserID wird random erstellt von 999
        int pUserID = rand.nextInt(userIDrandom);
            
        //User bekommt Startgeld
        double pMoney = 100.0;
            
        User user = new User(pName, pAge, pUsername, pPassword, pMoney, pUserID);

        System.out.println("Dein Username: " + user.getUsername());
        breakLine();
        System.out.println("Dein Password: " + user.getPassword() );
        breakLine();
        System.out.println("Dein Name: " + user.getName() );
        breakLine();
        System.out.println("Dein Alter: " + user.getAge());
        breakLine();
        System.out.println("Dein Guthaben: " + user.getMoney() );
        breakLine();
        System.out.println("Deine ID: " + user.getUserID() );

        write.writeLogin(user);
        write.writeUserlist(user);
        System.out.println("User erstellt!");
        return user;        
    }  

    
    //Hauptmenue des Programmes
    public int showMenu(){
        breakLine();
        System.out.println("(1) - Inventar");
        System.out.println("(2) - Einkaufszentrum");
        System.out.println("(3) - Liquide Mittel überprüfen");
        System.out.println("(4) - Benutzerprofil überprüfen/bearbeiten");
        System.out.println("(5) - Ausloggen/Abmelden");
        breakLine();

        int input = sc.nextInt();
        return input;
    }


    public void showMoney(User pUser, Cardmanagement pCardmanagement){
        breakLine();
        System.out.println("Dein Geld beträgt: " + pUser.getMoney());
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.next();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }else{
            System.out.println("Falsche Eingabe!");
            showMoney(pUser, pCardmanagement);
        }
    }
    
 
    public void showProfile(User pUser,Cardmanagement pCardmanagement){
        breakLine();
        System.out.println("Dein Username: " + pUser.getUsername());
        System.out.println("Dein Passwort: " + pUser.getPassword());
        System.out.println("Deine User ID " + pUser.getUserID());
        System.out.println("Dein Alter " + pUser.getAge() );
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.next();
        if (input.toLowerCase().equals("l")) {
            menumain(pCardmanagement);
        }else{
            System.out.println("Falsche Eingabe!");
            showProfile(pUser, pCardmanagement);
        }
    }

    public void logOut(Cardmanagement pCardmanagement){
        breakLine();
        System.out.println("Sie werden abgemeldet.......................");
        pCardmanagement.logOut();
        breakLine();

        System.exit(0);
    } 

    //hier wird das MEn
    public void menumain(Cardmanagement pCardmanagement){
        while(pCardmanagement.getLoggedIN() == true){
           // s1 = new Shop();
            switch(showMenu()){
                case 1: Inventory inv = new Inventory();
                        inv.showInventory();
                        break;
                case 2: /*s1.showShop(); */System.out.println("Shop");
                        break;
                case 3: showMoney(pCardmanagement.getUser(), pCardmanagement);
                        break;
                case 4: showProfile(pCardmanagement.getUser(), pCardmanagement);
                        break;
                case 5: logOut(pCardmanagement);
                        break;
                default:System.out.println("Falsche Eingbe!");
                        continue;
                        
            }
        }
    }
} 