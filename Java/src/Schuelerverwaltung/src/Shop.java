import java.util.Scanner;


public class Shop {
    double changeMoney;
    
    
    Scanner scanner = new Scanner(System.in);

    public  String antwort2;

    public void showShop(Cardslist pCardslist) {
            
        System.out.println("Hallo");
        System.out.println("");
        System.out.println("Wilkommen in unserem Shop!...");
        scanner.nextLine();
        System.out.println("Möchtest du dir das Angebot an Karten ansehen?");
        String antwort1 = scanner.nextLine();
            if (antwort1.equals("Ja") || antwort1.equals("ja") || antwort1.equals("JA")) {
                buyCard(pCardslist);
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
    public void buyCard(Cardslist pCardslist) {
        
        showCards();
        Shop[] ladeTheke = new Shop[4]; 
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
        if (antwort2.equals("Ja") || antwort2.equals("ja")) {
            
        }


    }
}
