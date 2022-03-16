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

public class ReadWrite{

    //Log In
    public void WriteLogin(User pUser){

        File folder = new File(".\\Users\\");
            folder.mkdirs();
            File userfile = new File(".\\Users\\" + pUser.getUsername() + ".txt");
            BufferedWriter writer;
            try { 
                userfile.createNewFile();
                writer = new BufferedWriter(new FileWriter(userfile)); 
                //In der Datei werden alle Werte untereinander geschrieben
                writer.write(pUser.getUsername());
                writer.newLine();
                writer.write(pUser.getPassword());
                writer.newLine();
                writer.write(pUser.getName());
                writer.newLine();
                writer.write(String.valueOf(pUser.getAge()));
                writer.newLine();
                writer.write(String.valueOf(pUser.getUserID()));
                writer.newLine();
                writer.write(String.valueOf(pUser.getMoney()));
                writer.newLine();
                writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
    }


        public void ReadLogin(){

        try {
            String reader1 = Files.readAllLines(Paths.get("user.txt")).get(3);

            if (UsernameCheck == reader1) {
                System.out.println("Username eingabe erfolgreich.");

            }else if (UsernameCheck != reader1) {
                System.out.println("Username eingabe nicht erfolgreich, bitte versuche es erneut.");
                logIn();
            }

        } catch (IOException e){
            e.printStackTrace();
        
        

        try {
            String reader2 = Files.readAllLines(Paths.get("user.txt")).get(4);
            if (PasswordCheck == reader2) {
                System.out.println("Passwort eingabe erfolgreich.");
            }
            else if(PasswordCheck != reader2){
                System.out.println("Passwort eingabe nicht erfolgreich, bitte versuche es erneut.");
                logIn();
            }
        
        }catch (IOException f) {
            f.printStackTrace();
        }
        
    }

  
}