package operator;

import java.util.Scanner;

public class Page117 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one Character..");
		String input = scanner.nextLine();
		char c = input.charAt(0);

		if(('a' <= c && c<= 'z') || ('A' <= c && c<= 'Z')){
			System.out.println("¾ËÆÄºª");
		}
		if('0' <= c && c<= '9'){
			System.out.println("¼ýÀÚ");
		}
		
		scanner.close();
		System.out.println("Program terminated");
	}

}






