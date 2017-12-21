package variable;

import java.util.Scanner;

public class Page40 {

	public static void main(String[] args) {
		System.out.println("Program Start ...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number ...");
		String inputData = scanner.nextLine();
		System.out.println("Input Data:"+inputData);
		// 문자열 5를 정수형으로 변환 한다.
		int intData = Integer.parseInt(inputData);
		int result = intData + 100;
		System.out.println(result);
		scanner.close();
	}

}






