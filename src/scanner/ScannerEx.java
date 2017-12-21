package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = null;
		int sum = 0;
		int cnt = 0;
		
		try {
			sc = new Scanner(new File("data.txt"));
			while(sc.hasNextLine()) {
				try {
					sum += sc.nextInt();
					cnt++;
				}catch(Exception e) {
					break;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		} finally {
			sc.close();
		}
		
		System.out.println(sum);
		System.out.println(sum/cnt);
	}

}


