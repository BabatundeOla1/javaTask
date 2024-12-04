package Card;

public class DeckOfCardMain {
    public static void main(String[] args) {
        DeckOfCard myDeckOfCards = new DeckOfCard();
        myDeckOfCards.shuffle();

        for(int count = 0; count < 52; count++){
            System.out.printf("%-19s", myDeckOfCards.cardDeal());

            if(count % 4 == 0){
                System.out.println();
            }
        }
    }

}
