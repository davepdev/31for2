package support;

	public enum Rank {

		  ACE("Ace","A",1),
		  TWO("Two","2",2),
		  THREE("Three","3",3),
		  FOUR("Four","4",4),
		  FIVE("Five","5",5),
		  SIX("Six","6",6),
		  SEVEN("Seven","7",7),
		  EIGHT("Eight","8",8),
		  NINE("Nine","9",9),
		  TEN("Ten","10",10),
		  JACK("Jack","J",10),
		  QUEEN("Queen","Q",10),
		  KING("King","K",10);

		  private final String name;
		  private final String letter;
		  private final int value;

		  Rank(final String name, final String letter, final int value) {
		    this.name = name;
		    this.letter = letter;
		    this.value = value;
		  }

		public String getLetter() {
			return letter;
		}

		public String getName() {
			return name;
		}

		public int getValue() {
			return value;
		}


	}
