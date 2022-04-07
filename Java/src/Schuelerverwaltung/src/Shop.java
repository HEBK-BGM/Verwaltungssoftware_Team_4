import java.util.Scanner;


public class Shop {
    double changeMoney;
    
    
    Scanner scanner = new Scanner(System.in);

    public  String antwort2;
    int antwort3;

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
     /*   if (inventory = voll) ||  {
        System.out.println("dein Inventar ist voll, du wirst zum Menü zurückgeschickt");    
        return;
        }
     */
        antwort2 = scanner.nextLine();
        if (antwort2.equals("Ja")||(antwort2.equals("ja"))) {
            System.out.println("Welche Karte möchtest du kaufen? (1) (2) (3) (4)");
            antwort3 = scanner.nextInt();
        }
        else {
            return;
        }
        /*if (antwort3 == 1) || (ladeTheke[0].price< budget) {
            add ladeTheke[0] to inventory;
            budget - ladeTheke[0];
        } 
        else if (antwort3 == 2) || (ladeTheke[1].price< budget) {
              add ladeTheke[1] to inventory;
              budget - ladeTheke[1];
          }
        else if (antwort3 == 3) || (ladeTheke[2].price< budget) {
            add ladeheke[2] to inventory;
            budget - ladeTheke[2];
        }
        else if (antwort3 == 4) || (ladeTheke[3].price< budget) {
            add ladeTheke[3] to inventory;
            budget - ladeTheke[3];
        }
        else {
            System.out.println("Entwewder du hast nicht genug Geld oder du hast nicht eine richtige Zahl eingetippt,"\n" du wirst zurück ins Menü geschickt");
        }
       */ 
    } 
     
}
