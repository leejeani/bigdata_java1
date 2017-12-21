package inter;

public class Flight implements Attackable {

	@Override
	public void attack() {
		System.out.println("Attack ....");
	}

	@Override
	public void clocking() {
		System.out.println("Clocking ...");
	}
	

}
