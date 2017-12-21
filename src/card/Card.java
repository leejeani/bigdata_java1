package card;

public class Card {
	// instance variable
	private String kind;
	private int number;
	// class variable
	private static int width = 100;
	private static int height = 250;
	
	public Card() {
	}

	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static int getWidth() {
		return width;
	}

	public static void setWidth(int width) {
		Card.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Card.height = height;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

	
	
}
