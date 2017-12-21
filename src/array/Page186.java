package array;

public class Page186 {

	public static void main(String[] args) {
		
		mypoint:
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i*j == 49){
					break  mypoint;
				}
				System.out.printf("%d * %d = %d\n", 
						          i,j,(i*j) );
			}
		}
		
	}

}




