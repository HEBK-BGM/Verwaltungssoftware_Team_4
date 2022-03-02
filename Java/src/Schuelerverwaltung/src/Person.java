public class Person {

    //Attribute
    private String name;
    private int age;

    //Person Konstruktor
    public Person(String pName, int pAge){
        setName(pName);
        setAge(pAge);
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
