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
			System.out.println("�޴��� �Է��ϼ���[q,f,w]");
			String m = scanner.next();

			if(m.equals("q")){
				flag = false;
			}else if(m.equals("f")){
				System.out.println("For Test");
				System.out.println("Input 2 Number..");
				num1 = Integer.parseInt(scanner.next());
				num2 = Integer.parseInt(scanner.next());
				// �Է� ���� ���� 
				// num1 ���� num2 ������ �հ� ���
			}else if(m.equals("w")){
				System.out.println("While Test");
				System.out.println("Input 1 Number..");
				num1 = Integer.parseInt(scanner.next());
				// 1���� �Է� ���� �������� �հ� ���
				
			} // end if

		} // end while
		scanner.close();
		System.out.println("Program End");
	}

}





