
import java.util.Scanner;

public class Inventory {
    private User presentUser;
    Cards[] cards = new Cards[20];
    Scanner sc = new Scanner(System.in);
    int cardchoice;
    // Methoden
   /* public Inventory(User pUser) {
        this.presentUser = pUser;
    } */

    public int textInventory() {
        breakLine();
        System.out.println("(1) - Eigene Karten anzeigen");
        System.out.println("(2) - Karte verkaufen");          
        breakLine();
        return sc.nextInt();
    }
    public void mainInventory() {
        switch(textInventory()) {
            case 1: showCards();
                    break;
            case 2: sellCardAufruf();
                    break;
            default:
        }
    }
    public void showInventory() {
        breakLine();
        System.out.println("Willkommen in deinem Inventar");
        System.out.println("Hier kannst du bis zu 20 Karten speichern und diese auch verkaufen");
        System.out.println("Was willst du tun?");
        mainInventory();

    }
    public void giveMoney() {
        //giveMoney() braucht sellCard()
    }
    public Cards getCard(Cards pCard) {
        return pCard;
    }
    public void sellCardAufruf() {
        sellCard(cards[cardchoice]);
    }
    public void sellCard(Cards pCard) {
        //sellCard() braucht showCards()
        breakLine();
        for (int u=0; u<cards.length; u++) {
            if (cards[u] == null) {
                System.out.println("Du hast keine Karten, die du verkaufen kannst.");
                break;
            }
            else {
                System.out.println("Wähle die Karte, die du verkaufen willst.");
                showCards();
                cardchoice = sc.nextInt();
                if (cardchoice <= 20) {
                    cards[cardchoice] = null;
                    double currentmoney = presentUser.getMoney();
                    double changemoney = pCard.getPrice();
                    currentmoney = currentmoney + changemoney;
                    System.out.println("Karte an Stelle" + cardchoice + "verkauft"); 
                    System.out.println("Dein neues Guthaben beträgt:" + currentmoney);
                }
                else {
                    System.out.println("Die angegebene Stelle existiert nicht");
                }  
            }
        }
    }
    private void showCards() {
        //showCards() braucht vermutlich ein Return-Wert aus Shop (von der buyCard())
        breakLine();
        for (int i=0, j=1; i<cards.length; i++, j++) {
             if (cards[0] == null) {
                System.out.println("Die Karte an Stelle " + j + " existiert noch nicht");
            }
             else {
                breakLine();
                System.out.println(cards[0]);
               /* System.out.println("Karte an Stelle " + j + " = " + cards[i].getName());
                System.out.println("Seltenheit:" + cards[i].getRarity());
                System.out.println("Preis:" + cards[i].getPrice());
                System.out.println("CardID:" + cards[i].getCardID()); */
            }
        }
    }
    private void breakLine() {
        System.out.println("--------------");
    }

    public void addCard(Cards pCard){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null){
                cards[i] = pCard;
                System.out.println("Karte wurde im Inventar auf Platz " + i + " gelegt.");
                return;
            }
        }
        System.out.println("Karte konnte nicht hinzugefügt werden. Das Inventar ist voll.");
    }
}


