public class Cardmanagement {

    //Attribute
    private User user;
    private Menu menu;
    private boolean loggedin;

   //Konstruktor Cardmanagement
   public void Cardmanagement(){
    
      Menu menu1 = new Menu();

      menu1.menustart();

   }

   /*
   //Methoden  
   public void logIn(){
   }
   */

   //Log In Methode 
   public void logIn(String pPassword){
      if(user.checkpassword(pPassword)){
         System.out.println("Sie wurden angemeldet");
         loggedin = true;
      }else {
         System.out.println("Anmeldung fehlgeschlagen");
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
