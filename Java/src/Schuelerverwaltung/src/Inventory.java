
import java.util.Scanner;

public class Inventory {
    Inventory[] cards = new Inventory[20];
    // Methoden
    public int textInventory() {
        Scanner sc = new Scanner(System.in);
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
            case 2: sellCard();
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
    public void sellCard() {
        //sellCard() braucht showCards()
        Scanner sc = new Scanner(System.in);
        breakLine();
        for (int u=0; u<=19; u++) {
            if (cards[u] == null) {
                System.out.println("Du hast keine Karten, die du verkaufen kannst.");
                break;
            }
            else {
                System.out.println("Wähle die Karte, die du verkaufen willst.");
                showCards();
                u = sc.nextInt();
            }  
        }
    }
    private void showCards() {
        //showCards() braucht vermutlich ein Return-Wert aus Shop (von der buyCard())
        // Inventory[] cards = new Inventory[20];
        breakLine();
        for (int i=0, j=1; i<=19; i++, j++) {
             if (cards[i] == null) {
                System.out.println("Die Karte an Stelle " + j + " existiert noch nicht");
            }
             else {
                breakLine();
                System.out.println("Karte an Stelle " + j + " = " + cards[i]);
            }
        }
    }
    private void breakLine() {
        System.out.println("--------------");
    }
}


