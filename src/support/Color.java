package support;


	public enum Color {
		  RED("Red"),
		  BLACK("Black");

		  private final String name;

		  Color(final String name) {
		    this.name = name;
		  }

		  public final String getName() {
		    return name;
		  }
		}