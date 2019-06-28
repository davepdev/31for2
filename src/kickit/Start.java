package kickit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import support.PlayingCard;
import support.Rank;
import support.Suit;
import support.Deck;
import support.Hand;

public class Start {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, JSONException {
		Deck deck = new Deck();
		deck.shuffle(3);
		
		//System.out.println(deck.getUnmodifiableCollection());
		System.out.println("Cards in deck: " + deck.numberOfCards());
		PlayingCard card;
		Hand hand1 = new Hand();
		Hand hand2 = new Hand();
		ObjectMapper mapper = new ObjectMapper();
		
		for (int i = 0; i < 6; i++ ) {
			card = deck.pop();
			//card.displayCard();
			hand1.addCard(card);
			card = deck.pop();
			hand2.addCard(card);
			
/*		    PlayingCard cardFromJson = mapper.readValue(jsonStr, PlayingCard.class);
		    
		    
		    JSONAssert.assertEquals(mapper.writeValueAsString(card), 
		    		mapper.writeValueAsString(cardFromJson),
		    		JSONCompareMode.LENIENT);
*/
			//System.out.println(card.getValue());
			//System.out.println(card.getRank());
			//System.out.println(card.getSuit().getSymbol());
			//System.out.println(card.getSuit().getColor());
		}

		System.out.println(hand1.getCards());
		System.out.println(hand2.getCards());
		
		System.out.println("Cards in deck: " + deck.numberOfCards());
		
		String jsonStr2 = mapper.writeValueAsString(hand1);
		System.out.println(jsonStr2);
		
		// Maybe need a constructor that takes Strings
		// and converts that into enum
		Rank myRank = Rank.valueOf("JACK");
		Suit mySuit = Suit.valueOf("SPADES");
		
		PlayingCard pc1 = new PlayingCard(myRank, mySuit);
		System.out.println(pc1);
		
		String jsonStr3 = mapper.writeValueAsString(pc1);
		System.out.println(jsonStr3);
		

		//hand1 = mapper.readValue(jsonStr, PlayingCard.class);

		
		//System.out.println(deck.getUnmodifiableCollection());
	
	}

}
