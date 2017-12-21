package product;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	public void buy(Product p){
		if(money < p.getPrice()){
			System.out.println("money �� �����մϴ�.");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println("���� �Ϸ�");
	}
	public void buys(Product [] ps){
		// �������� Product�� ���� �Ѵ�.
		// ��� ��ǰ�� ���� ���� 
		// �����ϰ� �ִ� �ݾ׺��� ������ ���� �Ұ�
		// ��ǰ ���� �� Money�� Point ����
		int msum = 0;
		int psum = 0;
		for(Product p: ps){
			msum += p.getPrice();
			psum += p.getBonusPoint();
		}
		if(money < msum){
			System.out.println("���� �� �� �����ϴ�.");
			return;
		}
		money -= msum;
		bonusPoint += psum;
		System.out.println("���� �Ϸ�");
	}
}










