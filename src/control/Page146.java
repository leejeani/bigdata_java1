package control;

public class Page146 {

	public static void main(String[] args) {
		
		String result = "";
		int a = 0;
		
		if(a == 1){
			int temp = 0;
			result = "1µî"+temp;
		}else if(a == 2){
			result = "2µî";
		}else if(a == 3){
			result = "3µî";
		}else{
			result = "Å»¶ô";
		} // end if
		
		
		
		switch(a){
		
		case 1:
			int temp = 0;
			result = "1µî"+temp;
			break;
		case 2:
			result = "2µî";
			break;
		case 3:
			result = "3µî";
			break;
		default:
			result = "Å»¶ô";
		} // end switch
		
		System.out.println(result);
	}

}







