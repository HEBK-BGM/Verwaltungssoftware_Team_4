
import java.util.Scanner;
public class Inventory {
    private Cards[] cards = new Cards[20];
    Scanner sc = new Scanner(System.in);
    private int cardchoice;
    private User presentUser;
    private static Cards boughtCard;
    private boolean running;

    // Methoden
    public Inventory(User pUser) {
        setUser(pUser);
    }
    public void setCard(Cards pCard) {
        boughtCard = pCard;
    }
    public void setUser(User pUser) {
        this.presentUser = pUser;
    }
    public User getUser() {
        return this.presentUser;
    }
    public Cards getBoughtCard() {
        return boughtCard;
    }
    public int textInventory() {
        breakLine();
        System.out.println("(1) - Eigene Karten anzeigen");
        System.out.println("(2) - Karte verkaufen");          
        breakLine();
        return sc.nextInt();
    }
    public void mainInventory() {
        switch(textInventory()) {
            case 1: showUsTheCards();
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
    public void sellCardAufruf() {
        sellCard(cards[cardchoice]);
     
    }
    public void sellCard(Cards pCard) {
        //sellCard() braucht showCards()
        breakLine();
        for (int u=0; u<cards.length; u++) {
            System.out.println("Wähle die Karte, die du verkaufen willst.");
            breakLine();
            showUsTheCards();
            breakLine();
            int antwortZ = sc.nextInt();
            cardchoice = antwortZ-1;
            if (cards[cardchoice] == null) {
                System.out.println("Du hast keine Karten, die du verkaufen kannst.");
                break;
            }
            else {
                if (cardchoice <= cards.length) {
                    double currentmoney = presentUser.getMoney();
                    double changemoney = cards[cardchoice].getPrice();
                    System.out.println("Altes Guthaben: " + presentUser.getMoney());
                    presentUser.setMoney(currentmoney + changemoney);
                    System.out.println("Karte an Stelle " + antwortZ + " verkauft"); 
                    System.out.println("Dein neues Guthaben beträgt: " + currentmoney);
                    cards[cardchoice] = null;
                    break;
                }
                else {
                    System.out.println("Die angegebene Stelle existiert nicht");
                }  
            }
        }
    }
    private void breakLine() {
        System.out.println("--------------");
    }
    public void addCard(Cards pCard){
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null) {
                boughtCard = pCard;
                System.out.println("Gekaufte Karte = " + getBoughtCard());
                this.cards[i] = pCard;
                int j = i+1;
                System.out.println("Karte wurde im Inventar auf Platz " + j + " gelegt.");
                System.out.println("Deine aktuellen Karten:");
                showUsTheCards();
                breakLine();
                return;
                
                
            }
        }
        System.out.println("Karte konnte nicht hinzugefügt werden. Das Inventar ist voll.");
    }    
    public void showUsTheCards() {
        int i = 0;
        int j = i+1;
        this.running = true;
        while (i<cards.length && this.running == true) {
            if (cards[i] == null) {
                if (boughtCard != null) {
                cards[i] = boughtCard;
                System.out.println("Die Karte an Platz " + j + " = " + cards[i]);
                i++;
                j++;
                this.running = false;
                }
                else {
                    this.running = false;
                    System.out.println("Du hast noch keine Karten");
                }
            }
            else if (cards[i] != null && this.running == true){
                 System.out.println("Karte an Platz " + j + " = " + cards[i]);
                 i++;
                 j++;
            }
            else {
                this.running = false;
                break;
            }   
        }
    }
}


