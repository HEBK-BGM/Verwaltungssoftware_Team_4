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

      menu1.menustart();
      
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
