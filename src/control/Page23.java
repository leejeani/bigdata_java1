package control;

public class Page23 {

	public static void main(String[] args) {
		int x = 7;
		int y = 5;
		int z = 2;
		int a = 2;
		int b = 2;
		
		int max = 0;
		int min = 0;
		
		if(x > y){
			max = x;
			min = y;
			if(min > z){
				min = z;
				if(min > a){
					min = a;
					if(min > b){
						min = b;
					}
				}
			}
			if(max < z){
				max = z;
			}
		}else{
			max = y;
			min = x;
			if(min > z){
				min = z;
				if(min > a){
					min = a;
					if(min > b){
						min = b;
					}
				}
			}
			if(max < z){
				max = z;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}

}



