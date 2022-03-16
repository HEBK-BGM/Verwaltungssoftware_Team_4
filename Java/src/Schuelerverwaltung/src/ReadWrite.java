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
    public void readUsername(Menu pMenu, User pUser) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader("Userlist.txt"));
        String line = br.readLine();
            while(line != null) {

                br.readLine();

                if(line == pMenu.getInputUs());
                    System.out.println("Erfolgreich Username eingegeben!");
                    pUser.setPassword(line);
                    break;
            }
        br.close();
    }

    //TODO readPassword fertigstellen
    public void readPassword(User pUser) throws IOException{
        int n = 2;
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(".\\Users\\" + pUser.getUsername() + ".txt"))){ 
            for(int i = 0; i < n; i++)
                reader.readLine();
                line = reader.readLine();
                pUser.setPassword(line);
                System.out.println("Anmeldung Erfolgreich!");
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


}