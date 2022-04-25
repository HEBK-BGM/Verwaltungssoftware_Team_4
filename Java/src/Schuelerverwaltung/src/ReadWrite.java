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
import java.net.http.HttpResponse.PushPromiseHandler;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWrite{

    private Scanner sc = new Scanner(System.in);
    

    //Writer
    public void writeLogin(User pUser){

        File folder = new File(".\\Users\\");
            folder.mkdirs();
            File userfile = new File(".\\Users\\" + pUser.getUsername() + ".txt");
            BufferedWriter writer;
            try { 
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
    public void readLogIn(User pUser) {
        try{
            //Frage nach dem Usernamen
            System.out.println("------------------");
            System.out.println("Gebe deinen Usernamen ein: ");
            String inputUS = sc.next();
            String line;
            BufferedReader br = new BufferedReader(new FileReader("Userlist.txt"));
                //check ob der Input auch dem Username in der Userlist.txt enstspricht. Geht jede einzelne Zeile durch und überprüft
                while((line = br.readLine() ) !=null){
                    if(inputUS.equals(line)){ //Wenn gefunden, dann setzt er den Usernamen auf die line
                        pUser.setUsername(line);
                        break;
                    }else{   //sonst wiederholt sich die while schleif
                        br.readLine();
                        continue;
                    }
                }
                br.close(); 

            //Frage nach dem Passwort
            System.out.println("------------------");
            System.out.println("Gebe dein Password ein: ");
            System.out.println("------------------");
            String inputPW = sc.next();
            BufferedReader br2 = new BufferedReader(new FileReader((".\\Users\\" + pUser.getUsername() + ".txt")));
                //For schleife, damit der Reader in Zeile 2 gelangt
                for(int x = 0; x < 1; x++){
                    br2.readLine();
                }
                //Überprüfung nach dem Passwort mit der Eingabe
                String line2 = br2.readLine();;
                if(inputPW.equals(line2)){
                    //wenn true, dann werden alle Werte dem User gegeben
                    pUser.setPassword(line2);
                    pUser.setName(br2.readLine());
                    pUser.setAge(Integer.parseInt(br2.readLine())); // Umwandlung vom String in int
                    pUser.setUserID(Integer.parseInt(br2.readLine()));
                    pUser.setMoney(Double.parseDouble(br2.readLine())); //Umwandlung von String ind double
                    System.out.println("Erfolgreich Angemeldet!");
                }else{
                    System.out.println("Falsches Password!");
                    System.exit(0);
                }

            br2.close();
            
            System.out.println("------------------");
            System.out.println("Dein Username: " + pUser.getUsername());
            System.out.println("Dein Password: " + pUser.getPassword());
            System.out.println("Dein Name: " + pUser.getName());
            System.out.println("Dein Alter: " + pUser.getAge());
            System.out.println("Deine UserID: " + pUser.getUserID());
            System.out.println("Dein Guthaben: " + pUser.getMoney());
            System.out.println("------------------");
            
        }catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }
    }


    public boolean checkUsername(String pUsername){
        boolean check = true;
        try{
            BufferedReader br = new BufferedReader(new FileReader("Userlist.txt"));
            String line;
                while((line = br.readLine() ) !=null){
                    if(pUsername.equals(line)){
                        check = false;
                        break;
                    }else{
                        br.readLine();
                        continue;
                    }
                }
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return check;
    }
    
}