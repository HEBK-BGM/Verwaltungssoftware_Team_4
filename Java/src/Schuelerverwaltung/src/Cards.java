public class Cards {
    
    int id = 001;
    String name = "exapmlepokemon";
    String rarity = "non rare";
    double price;
    

    if(rarity.equals = "non rare"){
        price = 1.00;
    }
    else 
    if(rarity.equals = "rare"){
    price = 5.00;        
    }
    else
    if(rarity.equals = "super rare"){
        price = 10.00;
    }
    else 
    if(rarity.equals = "extrem rare"){
        price = 25.00;
    }
    else 
    if(rarity.equals = "pogO"){
        price = 420.69;
    }
    
    
    String[] pokemoninfo = {String.valueOf(id), name, rarity, String.valueOf(price) };

    System.out.println(pokemoninfo[3]);
    

}
