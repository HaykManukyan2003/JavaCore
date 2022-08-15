package folders.card;

import java.security.SecureRandom;

public class DeckOfCards {

    private Card[] deck; // array of Card objects;
    private int currentCard; // index of next Card to be dealt;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom secureRandom = new SecureRandom();

    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    }

}
