package control;

public class Page161 {

	public static void main(String[] args) {
		// 구구단 출력(2~9단)
		
		for(int i=2; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.print("*");
				//System.out.printf("%d x %d = %d\n",
				//		i,j,i*j);
			} // end inner for
			System.out.println();
		} // end outter for
	}

}


