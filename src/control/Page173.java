package control;

import java.util.Scanner;

public class Page173 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean flag = true;
		Scanner scanner = null;
		scanner = new Scanner(System.in);
		System.out.println("Program Start");
		while(flag){
			System.out.println("메뉴를 입력하세요[q,f,w]");
			String m = scanner.next();

			if(m.equals("q")){
				flag = false;
			}else if(m.equals("f")){
				System.out.println("For Test");
				System.out.println("Input 2 Number..");
				num1 = Integer.parseInt(scanner.next());
				num2 = Integer.parseInt(scanner.next());
				// 입력 받은 수의 
				// num1 부터 num2 까지의 합과 평균
			}else if(m.equals("w")){
				System.out.println("While Test");
				System.out.println("Input 1 Number..");
				num1 = Integer.parseInt(scanner.next());
				// 1부터 입력 받은 수까지의 합과 평균
				
			} // end if

		} // end while
		scanner.close();
		System.out.println("Program End");
	}

}





