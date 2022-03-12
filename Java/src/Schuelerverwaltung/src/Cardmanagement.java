public class Cardmanagement {

    //Attribute
    private User user;
    private Menu menu1;

    private boolean loggedin = false;

   //Konstruktor Cardmanagement
   public void Cardmanagement(){
    
      menu1 = new Menu();

      user = menu1.createUser();
      menu1.menustart();
   }

   
   //Methoden  
   public void logIn(){
      String pPassword = menu1.logIn();
      this.logIn(pPassword);
   }
   

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
      menu1.menustart();
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
