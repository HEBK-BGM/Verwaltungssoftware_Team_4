public class Cards {

    public static void main(String[] args) throws Exception {
    
    int id = 001;
    String name = "exapmlepokemon";
    String rarity = "non rare";
    double price = 0.00;
    

    if(rarity.equals("non rare")){
        price = price + 1.00;
    }
    else 
    if(rarity.equals("rare")){
        price = price +  5.00;        
    }
    else
    if(rarity.equals("super rare")){
        price = price +  10.00;
    }
    else 
    if(rarity.equals("extrem rare")){
        price = price +  25.00;
    }
    else 
    if(rarity.equals("pogO")){
        price = price +  420.69;
    }
    
    
    String[] pokemoninfo = {String.valueOf(id), name, rarity, String.valueOf(price) };

    System.out.println(pokemoninfo[3]);

    }
    

}
