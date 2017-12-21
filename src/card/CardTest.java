package card;

public class CardTest {

	public static void main(String[] args) {
		Card card1 = 
				new Card("heart", 5);
		Card card2 = 
				new Card("dia", 10);
		System.out.println(card1+" "+Card.getWidth());
		System.out.println(card2+" "+Card.getWidth());
		Card.setHeight(350);
		Card.setWidth(200);
		System.out.println(card1+" "+Card.getWidth());
		System.out.println(card2+" "+Card.getWidth());
	
	}

}



