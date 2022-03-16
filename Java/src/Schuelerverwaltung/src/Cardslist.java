import java.util.Random;



public class Cardslist {
    Random random = new Random();
    String name;
    String rare;
    int id;
    double price;

    
    public Cardslist(String name, int id, String rare, double price) { // constructer
        this.name = name;
        this.rare = rare;
        this.price = price;
        
    }

    public Cardslist() {
    }

    public void randomCard() {

        Cardslist[] pokeObjects = new Cardslist[20];
        pokeObjects[1] = new Cardslist("Taubsi", 1, " - non rare ", 1.00);
        pokeObjects[2] = new Cardslist("Glumanda",2, "  - non rare ",1.00);
        pokeObjects[3] = new Cardslist("Schiggy",3, " - non rare ",1.00);
        pokeObjects[4] = new Cardslist("Bisasam",4, " - non rare ",1.00);
        pokeObjects[5] = new Cardslist("Tauboga",5, " - rare ",5.00);
        pokeObjects[6] = new Cardslist("Glutexo",6, " - rare ",5.00);
        pokeObjects[7] = new Cardslist("Schillok",7, " - rare ",5.00);
        pokeObjects[8] = new Cardslist("Bisaknosp",8, " - rare ",5.00);
        pokeObjects[9] = new Cardslist("Tauboss",9, " - super rare ",10.00);
        pokeObjects[10] = new Cardslist("Glurak",10, " - super rare ",10.00);
        pokeObjects[11] = new Cardslist("Bisaflor",11, " - super rare ",10.00);
        pokeObjects[12] = new Cardslist("Turtok",12," - super rare ",10.00);
        pokeObjects[13] = new Cardslist("Raupy",13," - non rare ",1.00);
        pokeObjects[14] = new Cardslist("Safcon",14," - rare ",5.00);
        pokeObjects[15] = new Cardslist("Smettbo",15," - super rare ",10.00);
        pokeObjects[16] = new Cardslist("Mewto",16," - extreme rare ",25.00);
        pokeObjects[17] = new Cardslist("Mew",17," - extreme rare ",25.00);
        pokeObjects[18] = new Cardslist("Manuel",18," - pogO ",420.69);
        

        







        for (int i = 0;i<5;i++) {

        
            int randomNumber=random.nextInt(pokeObjects.length);
      	    System.out.println(pokeObjects[randomNumber].name+pokeObjects[randomNumber].rare+pokeObjects[randomNumber].price);
            }



    } 
   
    }

