package operator;

import java.util.Scanner;

public class Page131 {

	public static void main(String[] args) {
		// 1. Scanner�� ���� ���ڸ� �Է� �޴´�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one Number..");
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		// ����ó��
		char c1 = input.charAt(0);
		char c2 = input2.charAt(0);
		
		if(!('0' <= c1 && c1 <='9')){
			System.out.println("���α׷� ����");
			scanner.close();
			System.exit(0);
		}
		if(!('0' <= c2 && c2 <='9')){
			System.out.println("���α׷� ����");
			scanner.close();
			System.exit(0);
		}
		
		// 2. �Է� ���� ���ڸ� ���������� ���� �Ѵ�.
		int data = Integer.parseInt(input);
		int data2 = Integer.parseInt(input2);
		
		// 3. �Է� ���� ���ڰ� Ȧ�� ���� ¦�� ����
		//    ��� �Ѵ�.
		String result = "";
		result = 
		((data+data2)%2) == 0 ? "¦��" : "Ȧ��";
	
		System.out.println(result);
	
		scanner.close();
	}

}



