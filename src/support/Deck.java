package support;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Stack;

public class Deck {

  private boolean isShuffled;
  private Stack<Card> deck;

  // default constructor, will create a single deck of 52 cards
  public Deck() {
    this(1);
  }

  // overloaded constructor, will create multiple decks of 52 cards
  public Deck(int numberOfDecks) {
    deck = new Stack<>();
    clearDeck();
    for (int i = 0; i < numberOfDecks; i++) {
      populateDeck();
    }
  }

  // a method to shuffle the collection of cards. default will shuffle 1x
  public void shuffle() {
    shuffle(1);
  }

  // overloaded shuffle method. will shuffle the deck a number of times.
  public void shuffle(int numberOfTimes) {
    isShuffled = true;
    for (int i = 0; i < numberOfTimes; i++) {
      Collections.shuffle(deck);
    }
  }

  // returns true if the deck has been shuffled
  public boolean isShuffled() {
    return isShuffled;
  }

  // returns the number of cards remaining in the deck
  public int numberOfCards() {
    return deck.size();
  }

  // a method to remove a card from the deck
  public Card removeCard(Card card) {
    if(deck.contains(Objects.requireNonNull(card))) {
      int index = deck.indexOf(card);
      return deck.remove(index);
    } else {
      return null;
    }
  }

  // returns true if the specified card is contained in the deck
  public boolean containsCard(Card card) {
    return deck.contains(Objects.requireNonNull(card));
  }

  // populates the deck with all possible cards in the deck. 52 cards
  public void populateDeck() {
    for(Suit suit: Suit.values()) {
      for(Rank rank: Rank.values()) {
        deck.add(new PlayingCard(rank,suit));
      }
    }
  }

  // Overloaded method which allows any number of decks of 52 cards.
  public void populateDeck(int numberOfDecks) {
    for(int i = 0; i < numberOfDecks; i++) {
      populateDeck();
    }
  }

  // remove all cards from the deck
  public void clearDeck() {
    deck.clear();
  }

  // returns an unmodifiable collection, a view, of the deck.
  public Collection<Card> getUnmodifiableCollection() {
    return new ArrayList<>(deck);
  }

  // returns the first card in the collection.
  public PlayingCard pop() {
    return (PlayingCard) deck.pop();
  }
}