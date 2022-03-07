public class Person {

    //Attribute
    private String name;
    private int age;

    //Konstruktor
    public Person(String pName, int pAge, double pMoney){
        setName(pName);
        setAge(pAge);
    }


    public Person(String pName, int pAge) {
    }


    //get-Methoden 
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    //set Methoden
    public void setName(String pName){
        this.name  = pName;
    }

    public void setAge(int pAge){
        this.age = pAge;
    }


}
