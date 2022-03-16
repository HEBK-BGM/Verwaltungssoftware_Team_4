public class Cardmanagement {

    //Attribute
    private User user;
    private Menu menu1;
    private ReadWrite readwrite;
    private boolean loggedin = false;

   //Konstruktor Cardmanagement
   public Cardmanagement(){
      menu1 = new Menu();
      readwrite = new ReadWrite();

      user = menu1.createUser();
      readwrite.writeLogin(user);
      readwrite.writeUserlist(user);
      


      menu1.menustart();
   }

   /*
   //Methoden  
   public void logIn(){
   }
   

   //Log In Methode 
   public void logIn(){
   }

   //LogOut Methode 
   public void logOut(){
      this.loggedin = false;
   }
   */



   //get User
   public User getUser(){
    return this.user;
   }


   //getLoggedIN
   public boolean getLoggedIN(){
      return this.loggedin;
   }
}
