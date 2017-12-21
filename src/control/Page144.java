package control;

import java.util.Scanner;

public class Page144 {

	public static void main(String[] args) {
		// Scanner를 통해 4개의 성적정보를 입력 받는다.
		// 예) 90 89 98 78
		// 평균이 90점이상 A, 95점이상이면 A+ or A-
		// 80점이상 B, 85점이상이면 B+ or B-
		// 70점이상 C, 75점이상이면 C+ or C-
		// 70점미만 F
		// 평균 점수와 학점을 출력 하시오
		int ko=0,en=0,ma=0,si=0;
		double avg=0.0;
		String result = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력 하시오?");
		
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
		
		System.out.println("평균:"+ avg);
		System.out.println("학점:"+ result);
		
		scanner.close();
	} // end main

}







