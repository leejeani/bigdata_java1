package control;

public class Page149 {

	public static void main(String[] args) {
		// 월을 입력 받아
		// 해당 월의 마지막 날을 출력 하시오
		int month = 2;
		int lastDay = 0;
		
		switch(month){
		case 1:	case 3:	case 5:	case 7:
		case 8:	case 10: case 12:
			lastDay = 31;
			break;
		case 2:
			lastDay = 28;
			break;
		default:
			lastDay = 30;
		} // end switch
		
		System.out.println(lastDay);
	}

}








