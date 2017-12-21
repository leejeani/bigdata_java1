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
		
		// ���� �� hp�� ���� �Ѵ�.
		// Warrior �� 3����
		// �� Warrior�� ���׹̳��� ��ģ hp ����
		// ���� ��Ų��.
		// Wizard �� 2����
		
		// swing�� fire�� �� �� 
		// hp�� ���� ��Ų��.
		
	}

}







