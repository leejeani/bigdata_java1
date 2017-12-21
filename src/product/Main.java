package product;

public class Main {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		Product [] ps = new Product[3];
		ps[0] = new Tv();
		ps[1] = new Computer();
		ps[2] = new Audio();
		
		for(Product p:ps){
			p.turnOn();
			if(p instanceof Computer){
				((Computer) p).playGame();
			}
		}
		
		b.buys(ps);
		System.out.println(b.money);
		System.out.println(b.bonusPoint);
		
	}

}





