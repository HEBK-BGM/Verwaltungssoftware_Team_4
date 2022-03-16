import java.util.Scanner;


public class Shop {
    double changeMoney;
    
    


 public  String antwort2;

 public  void showShop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo");
        System.out.println("Wilkommen in unserem Shop!...");
        scanner.nextLine();
        System.out.println("Möchtest du dir das Angebot an Karten ansehen?");
        String antwort1 = scanner.nextLine();
        if (antwort1.equals("Ja") || antwort1.equals("ja") || antwort1.equals("JA")) {
            showCards();
            System.out.println("Möchtest du eine Karten kaufen?");
         antwort2 = scanner.nextLine();


        }
        else {
            return;
        }
        
        if (antwort2.equals("Ja") || antwort2.equals("ja") || antwort2.equals("JA")) {
            buyCard(null);
        }
    }


    public  void showCards() {
        Cardslist s4 = new Cardslist();
        s4.randomCard();
    }
    public void buyCard(Cardslist pCardList) {
        
        
        


    }
}
