package support;
/**
 * stolen from https://codereview.stackexchange.com/questions/194134/my-first-deck-of-cards
 * 
 */
import java.util.Objects;

public class PlayingCard implements Card {

  private final Rank rank;
  private final Suit suit;
  private boolean isFaceUp;
  private final Color color;

  // default constructor
  public PlayingCard(final Rank rank, final Suit suit) {
    this.rank = rank;
    this.suit = suit;
    this.color = (suit.equals("Hearts") || suit.equals("Diamonds") ?  Color.RED : Color.BLACK);
    isFaceUp = true;
  }
  
  // constructor for fully spec 'ed object
  public PlayingCard(final Rank rank, final Suit suit, final Color color, final Integer value, final Boolean faceUp) {
	  System.out.println("inhere....");
	  // {"rank":"TEN","suit":"CLUBS","color":"BLACK","value":10,"faceUp":true}
	  // {"rank":"NINE","suit":"CLUBS","color":"BLACK","faceUp":true,"value":9}
	  	this.rank = null;
	    this.suit = null;
	    this.color = null;
	    this.isFaceUp = faceUp;
	  }

  // returns a string representation of the card
  @Override
  public String toString() {
    return rank.getLetter() + suit.getSymbol();
  }

  // compares one PlayingCard to another
  @Override
  public boolean equals(final Object o) {
    Objects.requireNonNull(o);
    boolean isEqual;

    if (!(o instanceof Card)) {
      isEqual = false;
    } else if (this == o) {
      isEqual = true;
    } else {
      var card = (Card) o;
      isEqual = (this.getRank().equals(card.getRank()) && this.suit.equals(card.getSuit()));
    }
    return isEqual;
  }

  // generates unique int value of a card
  @Override
  public int hashCode() {
    int suitMultiplier = suit.ordinal() + 2;
    int rankMultiplier = rank.ordinal() + 3;
    return (suitMultiplier * rankMultiplier) * 31;
  }

  // flip the card in the opposite orientation, faceUp/faceDown
  @Override
  public void flip() {
    isFaceUp = !isFaceUp;
  }

  // returns true if the card is faceUp
  @Override
  public boolean isFaceUp() {
    return isFaceUp;
  }

  // compares one card to another and returns an integer value
  @Override
  public int compareTo(Card o) {
    var card = Objects.requireNonNull(o);
    var suitCompareResult = this.suit.compareTo(card.getSuit());
    if (suitCompareResult != 0) {
      return suitCompareResult;
    } else {
      return this.rank.compareTo(card.getRank());
    }
  }


@Override
public Rank getRank() {
	return rank;
}

@Override
public Suit getSuit() {
	return suit;
}

@Override
public Color getColor() {
	return color;
}

@Override
public void displayCard() {
	  System.out.println(this.getValue() + " " + this.getRank()  
			  + " " + this.getSuit().getSymbol()
			  + " " + this.getSuit().getColor());	

}

@Override
public int getValue() {
	return rank.getValue();
}


}