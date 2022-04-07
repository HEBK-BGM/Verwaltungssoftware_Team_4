import java.util.Random;



public class Cardslist {
    
    Random random = new Random();
    Random random1 = new Random();
    Random random2 = new Random();
    Random random3 = new Random();
    public int  randomNumber;
    public int  randomNumber1;
    public int  randomNumber2;
    public int  randomNumber3;
    
    String name;
    String rare;
    int id;
    double price;
    public Shop[] pokeObjects = new Shop[4];
    Cardslist[] pokeObjects2 = new Cardslist[20];
   
    
    
    
    public Cardslist(String name, int id, String rare, double price) { // constructer
        this.name = name;
        this.rare = rare;
        this.price = price;
        
    }

    public Cardslist() {
        
    }
    

    public void randomCard(Shop pShop) {

        pokeObjects2[0] = new Cardslist("Ratfratz",0, " - non rare ", 1.00);
        pokeObjects2[1] = new Cardslist("Taubsi", 1, " - non rare ", 1.00);
        pokeObjects2[2] = new Cardslist("Glumanda",2, "  - non rare ",1.00);
        pokeObjects2[3] = new Cardslist("Schiggy",3, " - non rare ",1.00);
        pokeObjects2[4] = new Cardslist("Bisasam",4, " - non rare ",1.00);
        pokeObjects2[5] = new Cardslist("Tauboga",5, " - rare ",5.00);
        pokeObjects2[6] = new Cardslist("Glutexo",6, " - rare ",5.00);
        pokeObjects2[7] = new Cardslist("Schillok",7, " - rare ",5.00);
        pokeObjects2[8] = new Cardslist("Bisaknosp",8, " - rare ",5.00);
        pokeObjects2[9] = new Cardslist("Tauboss",9, " - super rare ",10.00);
        pokeObjects2[10] = new Cardslist("Glurak",10, " - super rare ",10.00);
        pokeObjects2[11] = new Cardslist("Bisaflor",11, " - super rare ",10.00);
        pokeObjects2[12] = new Cardslist("Turtok",12," - super rare ",10.00);
        pokeObjects2[13] = new Cardslist("Raupy",13," - non rare ",1.00);
        pokeObjects2[14] = new Cardslist("Safcon",14," - rare ",5.00);
        pokeObjects2[15] = new Cardslist("Smettbo",15," - super rare ",10.00);
        pokeObjects2[16] = new Cardslist("Mewto",16," - extreme rare ",25.00);
        pokeObjects2[17] = new Cardslist("Mew",17," - extreme rare ",25.00);
        pokeObjects2[18] = new Cardslist("Manuel",18," - pogO ",420.69);
        pokeObjects2[19] = new Cardslist("Glurak X ",19," - pogO ",420.69);
        


        


        
            int randomNumber=random.nextInt(pokeObjects2.length);
            
            int randomNumber1=random1.nextInt(pokeObjects2.length);
        
            int randomNumber2=random2.nextInt(pokeObjects2.length);
    
            int randomNumber3=random3.nextInt(pokeObjects2.length);

           System.out.println(pokeObjects2[randomNumber].name+pokeObjects2[randomNumber].rare+pokeObjects2[randomNumber].price); 
           System.out.println(pokeObjects2[randomNumber1].name+pokeObjects2[randomNumber1].rare+pokeObjects2[randomNumber1].price);
           System.out.println(pokeObjects2[randomNumber2].name+pokeObjects2[randomNumber2].rare+pokeObjects2[randomNumber2].price);
           System.out.println(pokeObjects2[randomNumber3].name+pokeObjects2[randomNumber3].rare+pokeObjects2[randomNumber3].price);
            
            
            
        } 
       
    }




