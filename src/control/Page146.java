package control;

public class Page146 {

	public static void main(String[] args) {
		
		String result = "";
		int a = 0;
		
		if(a == 1){
			int temp = 0;
			result = "1��"+temp;
		}else if(a == 2){
			result = "2��";
		}else if(a == 3){
			result = "3��";
		}else{
			result = "Ż��";
		} // end if
		
		
		
		switch(a){
		
		case 1:
			int temp = 0;
			result = "1��"+temp;
			break;
		case 2:
			result = "2��";
			break;
		case 3:
			result = "3��";
			break;
		default:
			result = "Ż��";
		} // end switch
		
		System.out.println(result);
	}

}







