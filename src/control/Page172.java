package control;

public class Page172 {

	public static void main(String[] args) {
		boolean flag = true;
		int i = 0;
		System.out.println("start");
		while(flag){
			System.out.println("While TEST"+i);
			i++;
			if(i == 300000){
				flag = false;
			}
		}
		System.out.println("end");
	} // end main

}




