package support;

public interface Card extends Comparable<Card> {

	  // returns the value of the Card. inherently coupled with the Rank
	  int getValue();

	  // returns the Rank of the Card. Values from Ace,2,3..., Jack,Queen,King
	  Rank getRank();

	  // returns the Suit of the Card. Values are Diamonds, Hearts, Spades, Clubs
	  Suit getSuit();

	  // returns the color of the Card. Values are Red or Black
	  Color getColor();

	  // display the card onscreen
	  void displayCard(); 

	  // compares this Card to another, returns if they are equal
	  boolean equals(final Object o);

	  // Generates a unique int value of a Card
	  int hashCode();

	  // flips a Card faceUp or faceDown 
	  void flip();

	  // returns true if this Card is faceUp
	  boolean isFaceUp();

	}
