import org.w3c.dom.UserDataHandler;

public class Cardmanagement {
    //Attribute
    private boolean loggedin = false;
    private User[] user = new User[4];


   public void Cardmanagement(){

    Menu menu = new Menu();

    user = menu.createUser();
   }

   //Methoden  


   public void logIn(){
       

   }

   public void logIn(String pPassword){

   }

   public void logOut(){
      loggedin = false;
   }



   //get User
   public User[] getUser(){
    return this.user;
   }

   //getLoggedIN
   public boolean getLoggedIN(){
      return loggedin;
   }

}
