import java.util.Scanner;


public class Shop {
    double changeMoney;
    
    
    Scanner scanner = new Scanner(System.in);

    public  String antwort2;

    public void showShop() {
            
        System.out.println("Hallo");
        System.out.println("");
        System.out.println("Wilkommen in unserem Shop!...");
        scanner.nextLine();
        System.out.println("Möchtest du dir das Angebot an Karten ansehen?");
        String antwort1 = scanner.nextLine();
            if (antwort1.equals("Ja") || antwort1.equals("ja") || antwort1.equals("JA")) {
                buyCard();
            }
            else {
                return;
            }
            if (antwort2.equals("Ja") || antwort2.equals("ja") || antwort2.equals("JA")) {
                
            }
    }

    public  void showCards() {
        Cardslist s4 = new Cardslist();
        s4.randomCard();
    }
    public void buyCard() {
        
        showCards();
        System.out.println("Möchtest du eine Karten kaufen?");
        antwort2 = scanner.nextLine();


    }
}
