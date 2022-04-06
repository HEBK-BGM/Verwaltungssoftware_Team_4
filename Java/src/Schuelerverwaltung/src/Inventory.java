
import java.util.Scanner;

public class Inventory {
    // Methoden
    public int textInventory() {
        //textInventory() wird vom Menu ausgeführt
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
        breakLine();
        System.out.println("Hier kannst du bis zu 20 Karten speichern und diese auch verkaufen");
        breakLine();
        System.out.println("Was willst du tun?");
        mainInventory();

    }
    public void giveMoney() {
        //giveMoney() braucht sellCard()
    }
    public void sellCard() {
        //sellCard() braucht showCards()
        breakLine();
        System.out.println("Hier kannst du bald deine Karten verkaufen");
    }
    private void showCards() {
        //showCards() braucht vermutlich ein Return-Wert aus Shop (von der buyCard())
        Inventory[] cards = new Inventory[20];
        for (int i=0; i<=19; i++) {
            if (cards[i] == null) {
                breakLine();
                System.out.println("Die Karte an Stelle " + i + " existiert noch nicht");
            }
            else {
                breakLine();
                System.out.println("Karte an Stelle " + i + " = " + cards[i]);
            }
        }
    }
    private void breakLine() {
        System.out.println("--------------");
    }
}


