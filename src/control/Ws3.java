package control;

public class Ws3 {

	public static void main(String[] args) {
		// 3���� �ֻ����� ������ ���ü� �ִ� 
		// ��츦 ��� ��� �Ͻÿ�
		// ù��° �ֻ����� Ȧ�� �̰�
		// �ι�° �ֻ��̴� ¦�� �϶��� 
		// ���� ���� ��� �Ͻÿ�
		
		int count = 0;
		int count2 = 0;
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				for(int z=1;z<=6;z++){
					if(i%2==0 && j%2==1){
						count2++;
					}
					count++;
				}
			}
		}
		System.out.println("Result:"
		                    +100.0*count2/count);
	}

}


