package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.eRank;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[3];
		
		iScore[0] = 0;
		iScore[1] = 0;
		iScore[2] = 0;
		
		
		Collections.sort(cards);
		
		
		 for(Card c :cards){
			
			
			switch(c.geteRank())
			{
			case TWO:
			case THREE:
			case FOUR:
			case FIVE:
			case SIX:
			case SEVEN:
			case EIGHT:
			case NINE:
			case TEN:
				iScore[0]=iScore[0]+c.geteRank().getiRankNbr();
				iScore[1]=iScore[1]+c.geteRank().getiRankNbr();
				iScore[2]=iScore[2]+c.geteRank().getiRankNbr();
				
				 
				break;
			case JACK:
			case QUEEN:
			case KING:
				iScore[0]=iScore[0]+10;
				iScore[1]=iScore[1]+10;
				iScore[2]=iScore[2]+10;
				 
			break;
			case ACE:
				 
					iScore[0]=iScore[0]+11;
					
				 
					iScore[1]=iScore[1]+1;
					if(iScore[2]>=11) {
						iScore[2]=iScore[2]+1;
						
					}
					else {
						iScore[2]=iScore[2]+11;
						
					}
				 
				
				  
					  
					 
					 
				  
				
				
			
	
			}
			 
		}
		
		return iScore;
	}
	
	public void Draw(Deck d)
	
	{
		cards.add(d.Draw());
		 
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
