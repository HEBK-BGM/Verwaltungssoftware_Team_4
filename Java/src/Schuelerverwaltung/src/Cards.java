public class Cards {
    //Attribute
    private String rarity;
    private String name;
    private int cardID;
    private double price;


   
    public Cards(String pName, int pCardID, String pRarity, double pPrice){

        this.setName(pName);
        this.setCardID(pCardID);
        this.setRarity(pRarity);
        this.setPrice(pPrice);
    }
    
    //get-Methoden
    public String getName() {
        return name; 
    }
    public String getRarity() {
        return rarity;
    }
    public double getPrice() {
        return price;
    }
    public int getCardID() {
        return cardID; 
    }
    //set-Methoden
    public void setName(String pName) {
        this.name = pName;
    }
    public void setRarity(String pRarity) {
        this.rarity = pRarity;
    }
    public void setPrice(double pPrice) {
        this.price = pPrice;
    }
    public void setCardID(int pCardID) {
        this.cardID = pCardID;
    }
    public String toString(){
        return "Name: "  + name + " CardID: " + cardID + " Rarität: " + rarity+ " Preis: " + price;
    }
}