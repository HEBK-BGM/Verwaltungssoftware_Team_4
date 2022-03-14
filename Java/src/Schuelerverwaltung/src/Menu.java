import java.util.Scanner;
import java.util.Random;

import java.io.File;  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        
        int input = sc.nextInt();
        if (input == 1){
            logIn();
        }else if (input == 2){
            createUser();
        }

    }

    //Log In
    public String logIn(){

        //check Username
        breakLine();
        System.out.println("Bitte geben Sie ihren Username ein: ");
        breakLine();

        //Scanner 
        String UsernameCheck = sc.nextLine();

        try { 
        BufferedReader reader1; //Neuer Reader
        reader1 = new BufferedReader(new FileReader("user.txt"));

        if((UsernameCheck == reader1.readLine(3)) != null) {
            System.out.println("Username eingabe erfolgreich.");

        }else if(UsernameCheck != reader1.readLine(3)) != null){
            System.out.println("Username eingabe nicht erfolgreich, bitte versuche es erneut.");
            logIn();
        }
        reader1.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        
        

        //ckeck Password
        breakLine();
        System.out.println("Bitte geben Sie ihr Passwort ein: ");
        breakLine();

        //Scanner
        String PasswordCheck = sc.nextLine();

        try { 
        BufferedReader reader2; //Reader 
        reader2 = new BufferedReader(new FileReader("user.txt"));
        if((PasswordCheck == reader2.readLine(3)) != null) {
            System.out.println("Passwort eingabe erfolgreich.");
        }
        else if(PasswordCheck != reader2.readLine(4)) != null){
            System.out.println("Passwort eingabe nicht erfolgreich, bitte versuche es erneut.");
            logIn();
        }
        reader2.close();
        }catch (IOException f) {
            f.printStackTrace();
        }
        
    }
    


    /*
    //Anmelden
    public String logIn(){
        breakLine();

        BufferedReader reader;
        System.out.println("Bitte geben Sie ihr Benutzernamen ein: ");
        
        System.out.println("Bitte geben Sie ihr Passwort ein: ");

        breakLine();
        return testUser;  
    }
    */
    
    

    //Erstellt einen neuen User
    public User createUser(){
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
            System.out.println("Dein UserID lautet:" + pUserID);
            
            //User bekommt Startgeld
            double pMoney = 100.00;
            System.out.println("Dein Geld beträgt:" + pMoney);

            breakLine();
            
            
            File folder = new File(".\\Users\\");
            folder.mkdirs();
            File userfile = new File(".\\Users\\" + pUsername + ".txt");
            BufferedWriter writer;
            try { 
                userfile.createNewFile();
                writer = new BufferedWriter(new FileWriter(userfile)); 
                //In der Datei werden alle Werte untereinander geschrieben
                writer.write(pUsername);
                writer.newLine();
                writer.write(pPassword);
                writer.newLine();
                writer.write(pName);
                writer.newLine();
                writer.write(String.valueOf(pAge));
                writer.newLine();
                writer.write(String.valueOf(pUserID));
                writer.newLine();
                writer.write(String.valueOf(pMoney));
                writer.newLine();
                writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
    
        return null;    
    }  
    
    
    //Hauptmenue des Programmes
    public int showMenu(){
        System.out.println("(1) - Inventar");
        System.out.println("(2) - Einkaufszentrum");
        System.out.println("(3) - Liquide Mittel überprüfen");
        System.out.println("(4) - Benutzerprofil überprüfen/bearbeiten");
        System.out.println("(5) - Ausloggen/Abmelden");
        
        return sc.nextInt();

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
    

    public void showMoney(User pUser){
        breakLine();
        System.out.println("Dein Geld beträgt: " + pUser.getMoney());
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.nextLine();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }
    }
    
 
    public void showProfile(User pUser){
        breakLine();
        System.out.println("Dein Username: " + pUser.getUsername());
        System.out.println("Dein Passwort: " + pUser.getPassword());
        System.out.println("Deine User ID " + pUser.getUserID());
        System.out.println("Dein Alter " + pUser.getAge() );
        breakLine();

        System.out.println("Drücke -L- um zurück ins Menu zu gelangen");

        String input = sc.nextLine();
        if (input.toLowerCase().equals("l")) {
            showMenu();
        }
    }

    public void logOut(Cardmanagement pCardmanagement){
        breakLine();
        System.out.println("Sie werden abgemeldet.......................");
        pCardmanagement.logOut();
        breakLine();

        menustart();
    } 
    

    public void menumain(Cardmanagement pCardmanagement, User pUser){
        while(pCardmanagement.getLoggedIN()== true);
        switch(showMenu()){
            case 1: //pCardmanagement.getUser(). show inventory muss zum User
                    break;
            case 2: //showShop() Shop wird angezeigt
                    break;
            case 3: showMoney(pUser);
                    break;
            case 4: showProfile(pUser);
                    break;
            case 5: logOut(pCardmanagement);
                    break;
            default:
        }
    }



    
  
    
   

} 