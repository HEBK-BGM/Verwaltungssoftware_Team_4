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

    private String line;

    public void setLine(String pLine){
        this.line = pLine;
    }

    public String getLine(){
        return line;
    }
    

    //Writer
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


    //Reader
    public void readLogIn() {
        try{
            System.out.println("Gebe deinen Usernamen ein: ");
            String inputUS = sc.next();
            String pLine;
            BufferedReader br = new BufferedReader(new FileReader("Userlist.txt"));
                while((pLine = br.readLine() ) !=null){
                    if(inputUS.equals(pLine)){
                        System.out.println("Dein Username: " + pLine);
                        setLine(pLine);
                        break;
                    }else{
                        continue; 
                    }
                }
                br.close(); 
                String pUsername = line; 
                System.out.println(pUsername);

        }catch (IOException e){
            e.printStackTrace();
        }

        try{
            System.out.println("Gebe dein Password ein: ");
            String inputPW = sc.next();
            String pLine;
            BufferedReader br = new BufferedReader(new FileReader((".\\Users\\" + getLine() + ".txt")));
            for(int x = 1; x < 2; x++){
                br.readLine();

                if(br.readLine().equals(inputPW)){
                    String pPassword = br.readLine();
                    System.out.println("Dein Password: " + pPassword);
                }else{
                    System.out.println("Falsches Passwort!");
                    System.exit(0);
                }
            }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        } 


    }
    
    
    
   
   
    
    

        
    
    
    
    


}