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
   }

   public void logIN(){
      if(menu.menustart().equals("1")){
         r.readLogIn(user);
         loggedin = true;
         menu.menumain(this, user);
      }else if(menu.menustart().equals("2")){
         menu.createUser(); 
         loggedin = true; 
         menu.menumain(this, user); 
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
