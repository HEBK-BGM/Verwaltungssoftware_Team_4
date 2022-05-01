import java.util.Scanner;

public class Shop {
    public Cards[] ladeTheke = new Cards[4];
    private Cardslist myCardslist;
    private User presentUser;

    Scanner scanner = new Scanner(System.in);

    public String antwort2;
    static int antwort3;

    public Shop(Cardslist pCardslist, User pUser) {
        this.myCardslist = pCardslist;
        this.presentUser = pUser;
    }

    public void showShop() {

        System.out.println("Hallo");
        System.out.println("");
        System.out.println("Willkommen in unserem Shop!...");
        scanner.nextLine();
        System.out.println("Möchtest du dir das Angebot an Karten ansehen?");
        String antwort1 = scanner.nextLine();
        if (antwort1.equals("Ja") || antwort1.equals("ja") || antwort1.equals("JA")) {
            buyCard();
        } else {
            return;
        }
        if (antwort2.equals("Ja") || antwort2.equals("ja") || antwort2.equals("JA")) {

        }
    }

    public void showCards() {
        for (int i = 0; i < ladeTheke.length; i++) {
            System.out.println(i + " " + ladeTheke[i]);
        }

    }

    public void buyCard() {

        // ladeTheke[0].copy(pCardslist.pokeObjects);
        ladeTheke[0] = myCardslist.randomCard();
        ladeTheke[1] = myCardslist.randomCard();
        ladeTheke[2] = myCardslist.randomCard();
        ladeTheke[3] = myCardslist.randomCard();
        showCards();
        System.out.println("Möchtest du eine Karte kaufen?");
        antwort2 = scanner.nextLine();
        /*
         * for (int x=0; x < cards.length; x++)
         * if (x == cards.length - 1) {
         * System.out.println("Dein Inventar ist voll!")
         * }
         */

        if (antwort2.equals("Ja") || (antwort2.equals("ja"))) {
            System.out.println("Welche Karte möchtest du kaufen? (1) (2) (3) (4)");
           antwort3 = scanner.nextInt();
        } else {
            return;
        }
        presentUser.getInventory().addCard(ladeTheke[antwort3-1]);
       

    }

}
