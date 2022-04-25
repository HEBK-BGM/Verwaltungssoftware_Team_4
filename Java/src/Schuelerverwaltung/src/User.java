public class User extends Person {

    //Attribute
    private String username;
    private String password = "";
    private int userID;
    private double money;
    private Inventory inventory;

    //User Konstruktor
    public User(String pName, int pAge, String pUsername, String pPassword, double pMoney, int pUserID) {
        super(pName, pAge);
        setUsername(pUsername);
        setPassword(pPassword);
        setMoney(pMoney);
        setUserID(pUserID);
        this.inventory = new Inventory();
    }

    

    //set-Methoden
    public void setPassword(String pPassword){
        this.password = pPassword;
    }

    public void setUsername(String pUsername){
        this.username = pUsername;
    }

    public void setMoney(double pMoney){
        this.money = pMoney;
    }

    public void setUserID(int pUserID){
        this.userID = pUserID;
    }


    //get-Methoden
    public String getPassword(){
        return password;
    }

    public String getUsername(){
        return username;
    }

    public int getUserID(){
        return userID; 
    }

    public double getMoney(){
        return money;
    }

    public Inventory getInventory(){
        return this.inventory;
    }



    //Passwort ändern 
    public void changePassword(String pPassword){   
        if(pPassword.length() < 4){
            System.out.println("Das Passwort konnte nicht geändert werden!");
        }else{
            System.out.println("Das Passwort wurde erfolgreich geändert.");
            this.password = pPassword;
            System.out.println("Neues Passwort: "+ this.password);
        } 
    }

    //Username ändern
    public void changeUsername(String pUsername){   
        if(pUsername.equals(null) || pUsername.equals("")){
            System.out.println("Benutzername konnte nicht geändert werden!");
        }else{
            System.out.println("Benutzername wurde erfolgreich geändert!");
            this.username = pUsername;
            System.out.println("Neuer Benutzername: " + this.username);
        }
        
    }
    //Methode um geld hinzuzufügen 
    public void addMoney(double pMoney){
        if(pMoney > 1000.0){
            System.out.println("Du kannst nicht mehr als 1000 hinzufügen!");
        }else if(pMoney < 0 ){
            System.out.println("Du kannst nur Geld hinzufügen!");
        }else{
            this.money = pMoney + money;
        }
    }

    public boolean checkpassword(String pPassword){
        return password == pPassword;
    }   

    public void checkusername(String pUsername){
        if(pUsername.equals(null) || pUsername.equals(" ")){
            System.out.println("Falsche Benutzername!");
        }
    }
}
