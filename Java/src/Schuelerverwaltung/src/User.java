public class User extends Person {

    //Attribute
    private String username;
    private String password = "";
    private int userID;
    private double money;

    //User Konstruktor
    public User(String pName, int pAge, String pUsername, String pPassword, int pUserID, double pMoney) {
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
    
    }
}
