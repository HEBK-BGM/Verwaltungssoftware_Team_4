import java.util.Random;



public class Cardslist {

    public Cardslist(String name, int id, String rare) { // constructer
    }

    public void cardlist() {

        Cardslist[] pokeObjects = new Cardslist[20];
        pokeObjects[1] = new Cardslist("Taubsi", 1, "non rare");
        pokeObjects[2] = new Cardslist("Glumanda",2, "non rare");
        pokeObjects[3] = new Cardslist("Schiggy",3, "non rare");
        pokeObjects[4] = new Cardslist("Bisasam",4, "non rare");
        pokeObjects[5] = new Cardslist("Tauboga",5, "rare");
        pokeObjects[6] = new Cardslist("Glutexo",6, "rare");
        pokeObjects[7] = new Cardslist("Schillok",7, "rare");
        pokeObjects[8] = new Cardslist("Bisaknosp",8, "rare");
        pokeObjects[9] = new Cardslist("Tauboss",9, "super rare");
        pokeObjects[10] = new Cardslist("Glurak",10, "super rare");
        pokeObjects[11] = new Cardslist("Bisaflor",11, "super rare");
        pokeObjects[12] = new Cardslist("Turtok",12,"super rare");
        pokeObjects[13] = new Cardslist("Raupy",13,"non rare");
        pokeObjects[14] = new Cardslist("Safcon",14,"rare");
        pokeObjects[15] = new Cardslist("Smettbo",15,"super rare");
        pokeObjects[16] = new Cardslist("Mewto",16,"extreme rare");
        pokeObjects[17] = new Cardslist("Mew",17,"extreme rare");
        pokeObjects[18] = new Cardslist("Manuel",18,"pogO");
        Random random = new Random();
        int index = random.nextInt(pokeObjects.length);
        System.out.println(pokeObjects[index]);




    } 
}
