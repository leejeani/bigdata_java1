package control;

import java.util.Scanner;

public class Page144 {

	public static void main(String[] args) {
		// Scanner�� ���� 4���� ���������� �Է� �޴´�.
		// ��) 90 89 98 78
		// ����� 90���̻� A, 95���̻��̸� A+ or A-
		// 80���̻� B, 85���̻��̸� B+ or B-
		// 70���̻� C, 75���̻��̸� C+ or C-
		// 70���̸� F
		// ��� ������ ������ ��� �Ͻÿ�
		int ko=0,en=0,ma=0,si=0;
		double avg=0.0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է� �Ͻÿ�?");
		
		ko = Integer.parseInt(scanner.nextLine());
		en = Integer.parseInt(scanner.nextLine());
		ma = Integer.parseInt(scanner.nextLine());
		si = Integer.parseInt(scanner.nextLine());
		
		avg = (ko+en+ma+si)/4.0;
		
		if(90 <= avg){
			if(avg >= 95){
				result = "A+";
			}else{
				result = "A-";
			}
		}else if(80 <= avg && 90 < avg){
			if(avg >= 85){
				result = "A+";
			}else{
				result = "A-";
			}
		}else if(70 <= avg && 80 < avg){
			if(avg >= 75){
				result = "A+";
			}else{
				result = "A-";
			}
		}else{
			result = "F";
		} // end if
		
		System.out.println("���:"+ avg);
		System.out.println("����:"+ result);
		
		scanner.close();
	} // end main

}







