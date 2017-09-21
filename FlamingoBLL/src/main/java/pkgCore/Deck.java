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

	 
}
