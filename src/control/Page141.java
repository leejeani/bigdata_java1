package control;

public class Page141 {

	public static void main(String[] args) {
		String result = "";
		int score = 84;
		// 70점이상이면 골드
		// 30점이상 70점미만 이면 실버
		// 30점 미만 이면 브론즈
		if(score >= 70){
			result = "골드";
		}else if(30 <= score && score < 70){
			result = "실버";
		}else if(score < 30){
			result = "브론즈";
		}
		System.out.println(result);
	}

}




