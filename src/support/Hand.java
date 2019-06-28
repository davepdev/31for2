package support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;


public class Hand implements Comparable<Hand> {

	  private List<Card> cards;

	  // default constructor
	  public Hand() {
	    cards = new ArrayList<>();
	  }

	  // will add a specific card to the Hand
	  public void addCard(Card card) {
	    cards.add(Objects.requireNonNull(card));
	  }

	  // will remove a specific card from the Hand if it's contained in the Hand
	  public Card removeCard(Card card) {
	    if (cards.contains(Objects.requireNonNull(card))) {
	      int index = cards.indexOf(card);
	      return cards.remove(index);
	    } else {
	      throw new IllegalArgumentException("This card did not exist in the hand. It cannot be removed.");
	    }
	  }

	  // method to display all the Cards in the Hand
	  public void displayHand() {
	    for (Card card : cards) {
	      if (card.isFaceUp()) {
	        card.displayCard();
	      } else {
	        System.out.println("[ Card Back ]");
	      }
	    }
	  }

	  // returns the sum of the value of all Cards in the Hand
	  public int calculateValue() {
	    var handValue = 0;
	    for (Card card : cards) {
	      handValue += card.getRank().getValue();
	    }
	    return handValue;
	  }

	  // remove all cards in the Hand
	  public void clearHand() {
	    cards.clear();
	  }

	  // returns a unmodifiable collection, a view, of all cards in the Hand
	  public Collection<Card> getUnmodifiableCollection() {
	    return Collections.unmodifiableCollection(cards);
	  }

	  // compares one Hand to another
	  public int compareTo(final Hand otherHand) {
	    return this.calculateValue() - otherHand.calculateValue();
	  }

	  // sorts cards in the Hand by Suit. Doesn't factor Rank within the Suit when sorting
	  public void sortyBySuit() {
	    cards.sort(Comparator.comparing(Card::getSuit));
	  }

	  // sorts cards in the Hand by Rank. Doesn't factor Suit when sorting.
	  public void sortByRank() {
	    cards.sort(Comparator.comparing(Card::getRank));
	  }

	  // sorts cards in the Hand by Color. Doesn't factor Suit or Rank when sorting.
	  public void sortByColor() {
	    cards.sort(Comparator.comparing(Card::getColor));
	  }

	  // sorts cards in the Hand by Suit then Rank in ascending order.
	  public void sort() {
	    cards.sort((Card first, Card second) -> first.compareTo(second));
	  }

	  // allows a card in the hand to be flipped in the opposite orientation
	  public void flipCard(int index) {
	    cards.get(index).flip();
	  }
	  
	  public List<Card> getCards() {
		  return cards;
	  }
	}