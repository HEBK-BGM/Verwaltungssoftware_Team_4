public class User extends Person {

    //Attribute
    private String username;
    private String password = "";
    private int userID;
    private double money;

    //User Konstruktor
    public User(String pName, int pAge, String pUsername, String pPassword, double pMoney, int pUserID) {
        super(pName, pAge);
        setUsername(pUsername);
        setPassword(pPassword);
        setMoney(pMoney);
        setUserID(pUserID);
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



    //changepassword 
    public void changepassword(String pPassword){   
        if(pPassword.length() < 4){
            System.out.println("Das Passwort konnte nicht geändert werden!");
        }else{
            System.out.println("Das Passwort wurde erfolgreich geändert.");
            this.password = pPassword;
            System.out.println("Neues Passwort: "+ pPassword);
        } 
    }

    public boolean checkpassword(String pPassword){
        return password == pPassword;
    }   

    public boolean checkusername(String pUsername){
        return username == pUsername;
    }
}
