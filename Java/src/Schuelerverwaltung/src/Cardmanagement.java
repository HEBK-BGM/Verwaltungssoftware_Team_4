import java.io.IOException;

public class Cardmanagement {

    //Attribute
    private User user;
    private Menu menu;
    private ReadWrite r;
    private boolean loggedin = false;

   //Konstruktor Cardmanagement
   public Cardmanagement(){
      menu = new Menu();
      user = new User(" ", 0 , " ", " ", 0.0 , 0);
      r = new ReadWrite();

      logIN();
      menu.menumain(this, user);
   }

   public void logIN(){
      if(menu.menustart().equals("1")){
         r.readLogIn(user);
         loggedin = true;
      }else if(menu.menustart().equals("2")){
         menu.createUser(); 
         loggedin = true;  
      }else{
         System.out.println("Falsche eingabe!");
         loggedin = false;
      }
   
   }
  
   
   
   //LogOut Methode 
   public void logOut(){
      this.loggedin = false;
   }
   

   //get User
   public User getUser(){
    return this.user;
   }


   //getLoggedIN
   public boolean getLoggedIN(){
      return this.loggedin;
   }
}
