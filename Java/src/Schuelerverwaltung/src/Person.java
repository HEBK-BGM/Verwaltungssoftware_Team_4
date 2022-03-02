public class Person {

    //Attribute
    private String name;
    private int age;
    private double money;

    //Konstruktor
    public Person(String pName, int pAge, double pMoney){
        setName(pName);
        setAge(pAge);
        setMoney(pMoney);
    }


    //get-Methoden 
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getMoney(){
        return money;
    }


    //set Methoden
    public void setName(String pName){
        this.name  = pName;
    }

    public void setAge(int pAge){
        this.age = pAge;
    }

    public void setMoney(double pMoney){
        this.money = pMoney;
    }
}
