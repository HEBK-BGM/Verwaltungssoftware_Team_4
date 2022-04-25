import java.util.Random;



public class Cardslist {
    
    Random random = new Random();   
    Cards[] pokeObjects2 = new Cards[20];
   
    
    
    
    public Cardslist() { // constructer      
    }

 




    public Cards randomCard() {

        pokeObjects2[0] = new Cards("Ratfratz",0, " - non rare ", 1.00);
        pokeObjects2[1] = new Cards("Taubsi", 1, " - non rare ", 1.00);
        pokeObjects2[2] = new Cards("Glumanda",2, "  - non rare ",1.00);
        pokeObjects2[3] = new Cards("Schiggy",3, " - non rare ",1.00);
        pokeObjects2[4] = new Cards("Bisasam",4, " - non rare ",1.00);
        pokeObjects2[5] = new Cards("Tauboga",5, " - rare ",5.00);
        pokeObjects2[6] = new Cards("Glutexo",6, " - rare ",5.00);
        pokeObjects2[7] = new Cards("Schillok",7, " - rare ",5.00);
        pokeObjects2[8] = new Cards("Bisaknosp",8, " - rare ",5.00);
        pokeObjects2[9] = new Cards("Tauboss",9, " - super rare ",10.00);
        pokeObjects2[10] = new Cards("Glurak",10, " - super rare ",10.00);
        pokeObjects2[11] = new Cards("Bisaflor",11, " - super rare ",10.00);
        pokeObjects2[12] = new Cards("Turtok",12," - super rare ",10.00);
        pokeObjects2[13] = new Cards("Raupy",13," - non rare ",1.00);
        pokeObjects2[14] = new Cards("Safcon",14," - rare ",5.00);
        pokeObjects2[15] = new Cards("Smettbo",15," - super rare ",10.00);
        pokeObjects2[16] = new Cards("Mewto",16," - extreme rare ",25.00);
        pokeObjects2[17] = new Cards("Mew",17," - extreme rare ",25.00);
        pokeObjects2[18] = new Cards("Manuel",18," - pogO ",420.69);
        pokeObjects2[19] = new Cards("Glurak X ",19," - pogO ",420.69);
        


        

    
         int randomNumber=random.nextInt(pokeObjects2.length);
            
            return pokeObjects2[randomNumber];
            
        } 
        
       
    }




