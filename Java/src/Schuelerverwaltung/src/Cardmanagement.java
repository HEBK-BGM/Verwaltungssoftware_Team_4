public class Cardmanagement {

    //Attribute
    public static User user;
    private Menu menu;
    private ReadWrite r;
    private Cardslist myCardslist;
    private Shop myShop;
    private boolean loggedin = false;

   //Konstruktor Cardmanagement
   public Cardmanagement(){

     
      user = new User(" ", 0 , " ", " ", 0.0 , 0);
      menu = new Menu(this);

      r = new ReadWrite();

      myCardslist = new Cardslist();
      myShop = new Shop(myCardslist, user);

      logIN();
   }
  
  
   //Log in Methode 
   public void logIN(){

      //bei "1" anmelden
      if(menu.menustart().equals("1")){
         r.readLogIn(user);
         loggedin = true;
         menu.menumain(this);
        
      }else if(menu.menustart().equals("2")){
         user = menu.createUser(); 
         loggedin = true; 
         menu.menumain(this);
      //sonst Falsche Eingabe
      }else{
         System.out.println("Falsche eingabe!");
         loggedin = false;
      }
   }
  
   
   
   //LogOut Methode 
   public void logOut(){
      this.loggedin = false;
      r.writeLogin(getUser());
      r.writeUserlist(getUser());
   }
   

   //get User
   public User getUser(){
    return user;
   }


   //getLoggedIN
   public boolean getLoggedIN(){
      return this.loggedin;
   }

   public Shop getShop(){
      return this.myShop;
   }
}
