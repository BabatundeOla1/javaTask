package Card;

import java.security.SecureRandom;

public class DeckOfCard {

    private final SecureRandom randomNumbers = new SecureRandom();
    private final int NUMBER_OF_CARDS = 52;

    private Card[] deck = new Card[NUMBER_OF_CARDS];
    private int currentCard = 0;

    public DeckOfCard(){
        String [] face = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        String [] suit = {"Diamond","Spade", "Club", "Heart"};

        for(int count = 0; count < deck.length; count++){
            deck[count] = new Card(face[count % 13], suit[count / 13]);
        }
    }

    public void shuffle(){
        currentCard = 0;

        for(int firstCard = 0; firstCard < deck.length; firstCard++){

            int secondCard = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Card temp = deck[firstCard];
            deck[firstCard] = deck[secondCard];
            deck[secondCard] = temp;
        }
    }

    public Card cardDeal(){
        if(currentCard < deck.length){
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }
}
