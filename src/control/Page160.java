package control;

public class Page160 {

	public static void main(String[] args) {
		// 2���� ��� �Ͻÿ�
		// 2���� ����� �հ� ����� ���Ͻÿ�
		int sum = 0;
		int count = 0;
		for(int i=1;i<=9;i++){
			System.out.printf("2 * %d = %d\n",i,2*i);
			sum += 2*i;
			count++;
		} // end for
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+sum/(count*1.0));
	}

}




