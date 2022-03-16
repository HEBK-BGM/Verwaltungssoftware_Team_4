public class Cards {
    //Attribute
    private String rarity;
    private String name;
    private int cardID;
    private double price;

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
    //show-Methoden
    public void showName() {
        getName();
        System.out.println(name);
    }
    public void showRarity() {
        getRarity();
        System.out.println(rarity);
    }
    public void showPrice() {
        getPrice();
        System.out.println(price);
    }
    public void showCardID() {
        getCardID();
        System.out.println(cardID);
    }
    /* Festlegung der Preise für die Seltenheiten
    public void rarities() {
        if (rarity.equals("non rare")) {
            price = price + 1.00;
        } else if (rarity.equals("rare")) {
            price = price + 5.00;
        } else if (rarity.equals("super rare")) {
            price = price + 10.00;
        } else if (rarity.equals("extrem rare")) {
            price = price + 25.00;
        } else if (rarity.equals("pogO")) {
            price = price + 420.69;
        } 
    } */
}