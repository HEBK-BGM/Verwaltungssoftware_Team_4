import java.util.Scanner;

import java.util.Random;

//Import für Reader/Writer
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWrite{

    Scanner sc = new Scanner(System.in);


    //Input Abfragen für Reader
    public String getInputUs(){
        System.out.println("Gebe deinen Usernamen ein:");   
        return sc.next();
    }

    public String getInputPw(){
        System.out.println("Gebe deinen Password ein:");   
        return sc.next();
    }

    //Log In
    public void writeLogin(User pUser){

        File folder = new File(".\\Users\\");
            folder.mkdirs();
            File userfile = new File(".\\Users\\" + pUser.getUsername() + ".txt");
            BufferedWriter writer;
            try { 
                if(userfile.exists()){
                    System.out.println("Den Usernamen gibt es bereits!");
                    System.exit(0);
                }else {
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
                }
            }catch (IOException e) {
                e.printStackTrace();
            } 
    }

    
    public void writeUserlist(User pUser){
        try{
            File userlist = new File("Userlist.txt");
            if(!userlist.exists()){
                userlist.createNewFile();
            }
            FileWriter fw = new FileWriter("Userlist.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.append((pUser.getUsername() + "\n"));
            bw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    //TODO readUsername fertigstellen
    public String readUsername() throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("Userlist.txt"));
        String line;
            while( (line = br.readLine() ) !=null){
                if(getInputUs().equals(line)){
                    System.out.println("Dein Username " + line);
                    break;
                }else{
                    continue; 
                }
            }
            
            br.close();

        return line;
    }

    /*
    //TODO readPassword fertigstellen
    public void readPassword(User pUser, Menu pMenu){

        BufferedReader br = new BufferedReader(new FileReader(".\\Users\\" + pUser.getUsername() + ".txt"));

        String ln =
        
        while( (ln = br.readLine()) != null) {
            
        }
    }
    */


}