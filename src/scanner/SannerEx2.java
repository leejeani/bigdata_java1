package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class SannerEx2 {

	public static void main(String[] args) 
			throws Exception {
		Scanner sc = 
				new Scanner(new File("data2.txt"));
		
		int datas[][] = new int[5][3]; // 5,3
		int i = 0;
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner sc2 = 
					new Scanner(line).useDelimiter(",");
			int j = 0;
			while(sc2.hasNextInt()) {
				datas[i][j] = sc2.nextInt();
				j++;
			}
			i++;
		}
		// 펙크맨이 첫줄을 가로로 먹고
		// 다시 아래로 내려 왔을때
		// 총 점수는 몇점인가
		int sum = 0;
		for(int ii=0;ii<datas.length;ii++) {
			for(int jj=0;jj<datas[ii].length;jj++) {
				if(ii==0 || jj==2) {
					sum += datas[ii][jj];
				}
			}
		}
		System.out.println(sum);

		
	}

}






