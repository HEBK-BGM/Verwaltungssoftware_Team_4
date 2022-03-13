import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Databank {
  public static void main(String[] args) {

    String[] User1 = {"name", "age", "ID", "Passwort", "Money"};
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
      writer.write("Writing to a file.");
      writer.write("\nHere is another line.");
      
      for (String UserInfo : User1) {
        writer.write("\n" + User1);
      }
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    try {
      BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
      String line;
      while((line = reader.readLine()) != null) {
        System.out.println(line);
      }
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}