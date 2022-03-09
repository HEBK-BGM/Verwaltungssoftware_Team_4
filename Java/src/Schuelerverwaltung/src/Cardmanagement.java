import org.w3c.dom.UserDataHandler;

public class Cardmanagement {
    //Attribute

    private User user;
    private boolean loggedin;


   public void Cardmanagement(){

    Menu menu = new Menu();

    user = Menu.createUser();
   }

   //Methoden  


   public void logIn(){
       

   }

   public void logIn(String pPassword){

   }

   public void logOut(){

   }



   //get User
   public User getUser(){
    return this.user;
   }
/*
   //getLoggedIN
   public boolean getLoggedIN(){

   }
*/
}
