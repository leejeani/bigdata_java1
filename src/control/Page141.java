package control;

public class Page141 {

	public static void main(String[] args) {
		String result = "";
		int score = 84;
		// 70���̻��̸� ���
		// 30���̻� 70���̸� �̸� �ǹ�
		// 30�� �̸� �̸� �����
		if(score >= 70){
			result = "���";
		}else if(30 <= score && score < 70){
			result = "�ǹ�";
		}else if(score < 30){
			result = "�����";
		}
		System.out.println(result);
	}

}




