package support;

public enum Suit {
	
		  CLUBS("Clubs",'\u2663', Color.BLACK),
		  DIAMONDS("Diamonds",'\u2666', Color.RED),
		  SPADES("Spades",'\u2660', Color.BLACK),
		  HEARTS("Hearts",'\u2764', Color.RED);

		  private final String name;
		  private final char symbol;
		  private final Color color;

		  Suit(final String name, final char symbol, final Color color) {
		    this.name = name;
		    this.symbol = symbol;
		    this.color = color;
		  }

		public char getSymbol() {			// TODO Auto-generated method stub
			return symbol;
		}
		
		public Color getColor() {
			return color;
		}
}
