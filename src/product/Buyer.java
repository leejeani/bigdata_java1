package product;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	public void buy(Product p){
		if(money < p.getPrice()){
			System.out.println("money 가 부족합니다.");
			return;
		}
		money -= p.getPrice();
		bonusPoint += p.getBonusPoint();
		System.out.println("구매 완료");
	}
	public void buys(Product [] ps){
		// 여러개의 Product를 구매 한다.
		// 모든 제품의 가격 합이 
		// 보유하고 있는 금액보다 많으면 구매 불가
		// 제품 구매 후 Money와 Point 변경
		int msum = 0;
		int psum = 0;
		for(Product p: ps){
			msum += p.getPrice();
			psum += p.getBonusPoint();
		}
		if(money < msum){
			System.out.println("구매 할 수 없습니다.");
			return;
		}
		money -= msum;
		bonusPoint += psum;
		System.out.println("구매 완료");
	}
}










