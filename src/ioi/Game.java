package ioi;

public class Game {

	public static void main(String[] args) {
		Item sward = new Sward(9, 2500);
		Item stick = new Stick(12, 7500);
		
		Character c = new Character("ch", 10000);
		System.out.println(c);
		c.buyItem(sward);
		c.attack();
		System.out.println(c);
		
		
		Warrior w = new Warrior("idw", 10000, 50);
		System.out.println(w);
		w.buyItem(sward);
		w.attack();
		System.out.println(w);
		
		Item witem = w.getItem();
		Sward sw = (Sward)witem;
		sw.swing();
		
		// 공격 시 hp가 감소 한다.
		// Warrior 는 3감소
		// 단 Warrior는 스테미나를 합친 hp 에서
		// 감소 시킨다.
		// Wizard 는 2감소
		
		// swing과 fire를 할 때 
		// hp를 감소 시킨다.
		
	}

}







