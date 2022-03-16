public class Cardmanagement {

    //Attribute
    private User user;
    private Menu menu1;
    private boolean loggedin = false;

   //Konstruktor Cardmanagement
   public Cardmanagement(){
      menu1 = new Menu();

      user = menu1.createUser();
      menu1.menustart();
   }

   
   //Methoden  
   public void logIn(){
      String pUsername = menu1.logInUsername();
      String pPassword = menu1.logInPassword();
      this.logIn(pUsername,pPassword);

   }
   

   //Log In Methode 
   public void logIn(String pUsername,String pPassword){

      if(user.checkusername(pUsername) == true){
         //Wenn true dann überprüfe password
         if(user.checkpassword(pPassword) == true){
            System.out.println("Sie wurden angemeldet");
            loggedin = true;
         }else {
            System.out.println("Anmeldung fehlgeschlagen");
            loggedin = false;
         }
      }else{
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
