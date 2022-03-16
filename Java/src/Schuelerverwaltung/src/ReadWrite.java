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
    public void writeLogin(User pUser){

        File folder = new File(".\\Users\\");
            folder.mkdirs();
            File userfile = new File(".\\Users\\" + pUser.getUsername() + ".txt");
            BufferedWriter writer;
            try { 
                userfile.createNewFile();
                writer = new BufferedWriter(new FileWriter(userfile)); 
                //In der User-Datei werden alle Werte untereinander geschrieben
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


    
    public void writeUserlist(User pUser){
        File userlist = new File(".\\Users\\userlist.txt");
        BufferedWriter writer;
        try {
            userlist.createNewFile();
            writer = new BufferedWriter(new FileWriter(userlist));
            writer.append(pUser.getUsername());
            writer.newLine();
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    //TODO readUsername fertigstellen
    public void readUsername(){
        try {
            String reader1 = Files.readAllLines(Paths.get(".\\Users\\")).get(1);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
    //TODO readPassword fertigstellen
    public void readPassword(){
        try {
            String reader2 = Files.readAllLines(Paths.get("user.txt")).get(2);
         
        } catch (IOException e){
            e.printStackTrace();
        }
        
    }
  
}