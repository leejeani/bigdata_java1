package operator;

import java.util.Scanner;

public class Page131 {

	public static void main(String[] args) {
		// 1. Scanner를 통해 숫자를 입력 받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one Number..");
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		// 예외처리
		char c1 = input.charAt(0);
		char c2 = input2.charAt(0);
		
		if(!('0' <= c1 && c1 <='9')){
			System.out.println("프로그램 종료");
			scanner.close();
			System.exit(0);
		}
		if(!('0' <= c2 && c2 <='9')){
			System.out.println("프로그램 종료");
			scanner.close();
			System.exit(0);
		}
		
		// 2. 입력 받은 숫자를 정수형으로 변경 한다.
		int data = Integer.parseInt(input);
		int data2 = Integer.parseInt(input2);
		
		// 3. 입력 받은 숫자가 홀수 인지 짝수 인지
		//    출력 한다.
		String result = "";
		result = 
		((data+data2)%2) == 0 ? "짝수" : "홀수";
	
		System.out.println(result);
	
		scanner.close();
	}

}



