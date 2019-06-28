package jsontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import support.PlayingCard;
import support.Rank;
import support.Suit;

public class Jsontest {
	
	public static void main(String[] args) throws IOException, JSONException {
		/*Suit suit = Suit.CLUBS;
		Rank rank = Rank.ACE;
		PlayingCard card = new PlayingCard(rank, suit);
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(card);
	    */
		
		
		
		ObjectMapper mapper = new ObjectMapper();

		MyObj myObj1 = new MyObj();		
		String jsonStr1 = mapper.writeValueAsString(myObj1);
	    
		MyObj myObj2 = new MyObj("hey thex", 41);
		//MyObj myObj2 = mapper.readValue(jsonStr,  MyObj.class);
		String jsonStr2 = mapper.writeValueAsString(myObj2);
		try {
		JSONAssert.assertEquals(
				  jsonStr1, jsonStr2, JSONCompareMode.LENIENT);
		} catch (AssertionError ae) {
			System.out.println("There was an error");
		}
		//Object staff2 = mapper.readValue(jsonStr, PlayingCard.class);
		
	    System.out.println(myObj1);
	    System.out.println(myObj2);
	  //  Object.class.
	    
	    //PlayingCard cardFromJson = mapper.readValue(jsonStr, PlayingCard.class);

	    
	 //  JSONAssert.assertEquals(mapper.reader(myObj1), mapper.reader(myObj2));

	}

}
