package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {
	private ArrayList<Card> cardsInDeck;
	public Deck() {
		for (eSuit eSuit:eSuit.values()) {
			for (eRank eRank: eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);

	}

	public Deck(int i) {
		for(int x = 0; x < i; x++) {
			for (eSuit eSuit:eSuit.values()) {
				for (eRank eRank: eRank.values()) {
					cardsInDeck.add(new Card(eSuit, eRank));

				}

			}
		}
		Collections.shuffle(cardsInDeck);
	}

	public ArrayList<Card> getDeck() {
		return cardsInDeck;
	}

    
	   
   







	public Card Draw() {
		return cardsInDeck.remove(0);
	}

	//	TODO: Add 'cards' attribute that is an ArrayList of Card


	//	TODO: Add a contructor that passes in the number of decks, and then populates
	//			ArrayList<Card> with cards (depending on number of decks).

	//			Example: Deck(1) will build one 52-card deck.  There are 52 different cards
	//			2 clubs, 3 clubs... Ace clubs, 2 hearts, 3 hearts... Ace hearts, etc

	//			Deck(2) will create an array of 104 cards.


	//	TODO: Add a draw() method that will take a card from the deck and
	//			return it to the caller
}
