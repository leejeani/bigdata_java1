package inter;

public class Main {

	public static void main(String[] args) {
		Attackable [] unit = new Attackable[2];
		unit[0] = new Tank();
		unit[1] = new Flight();
		
		for(Attackable a:unit){
			a.attack();
			a.clocking();
		}
	}

}






