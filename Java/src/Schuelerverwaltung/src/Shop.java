import java.util.Scanner;


public class Shop {
    double changeMoney;
    Shop[] ladeTheke = new Shop[4]; 
    
    Scanner scanner = new Scanner(System.in);

    public  String antwort2;
    int antwort3;
   
    public void showShop(Cardslist pCardslist, Inventory pInventory) {
            
        System.out.println("Hallo");
        System.out.println("");
        System.out.println("Wilkommen in unserem Shop!...");
        scanner.nextLine();
        System.out.println("Möchtest du dir das Angebot an Karten ansehen?");
        String antwort1 = scanner.nextLine();
            if (antwort1.equals("Ja") || antwort1.equals("ja") || antwort1.equals("JA")) {
                buyCard(pCardslist, pInventory);
            }
            else {
                return;
            }
            if (antwort2.equals("Ja") || antwort2.equals("ja") || antwort2.equals("JA")) {
                
            }
    }

    public  void showCards() {
        Cardslist s4 = new Cardslist();
        Shop a = new Shop();
        s4.randomCard(a);
    }
    public void buyCard(Cardslist pCardslist, Inventory pInventory) {
        
        showCards();
        
        ladeTheke[0] = new Shop();
        ladeTheke[1] = new Shop();
        ladeTheke[2] = new Shop();
        ladeTheke[3] = new Shop();
        ladeTheke[0] = pCardslist.pokeObjects[pCardslist.randomNumber];
        ladeTheke[1] = pCardslist.pokeObjects[pCardslist.randomNumber1];
        ladeTheke[2] = pCardslist.pokeObjects[pCardslist.randomNumber2];
        ladeTheke[3] = pCardslist.pokeObjects[pCardslist.randomNumber3];
        System.out.println("Möchtest du eine Karten kaufen?");
        antwort2 = scanner.nextLine();
        /*  for (int x=0; x < cards.length; x++)
           if (x == cards.length - 1) {
               System.out.println("Dein Inventar ist voll!")
           }
     */
        
        if (antwort2.equals("Ja")||(antwort2.equals("ja"))) {
            System.out.println("Welche Karte möchtest du kaufen? (1) (2) (3) (4)");
            antwort3 = scanner.nextInt();
        }
        else {
            return;
        }
            if (antwort3 == 1) {
            buyCard1(pInventory);
            }
            

      
    } 
        public void buyCard1(Inventory pInventory) {
            
            //ladeTheke[0] = cards[];
        }
     
}
