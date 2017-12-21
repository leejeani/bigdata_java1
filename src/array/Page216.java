package array;

public class Page216 {

	public static void main(String[] args) {
		int students [][] = {
			{100,95,80,77},
			{90,91,63,70},
			{81,70,89,72},
			{74,85,100,93}
		};
		// �츮�� �л��� ��ü ��հ�
		int sum = 0;
		double avgAll = 0.0;
		for(int [] temp:students){
			for(int data:temp){
				sum += data;
			}
		}
		avgAll = (sum*1.0)/
				(students.length*students[0].length);
		System.out.println(avgAll);
		// �� �л����� ����� ��� �Ͻÿ�
		
		
		double student [] = new double[4];
		
		for(int i=0;i<students.length;i++){
			int sum2 = 0;
			double avg = 0.0;
			for(int j=0;j<students[i].length;j++){
				sum2 += students[i][j];
				avg = sum2*1.0/students[i].length;
				student[i] = avg;
			}
		}
		
		for(int i=0;i<student.length;i++){
			System.out.printf("�л� %d:%f\n",
					i,student[i]);
		}
		
		// ��ü ���: 89.20
		// �л�1: 89.2
		// �л�2: 78.2
		// �л�3: 98.2
		// �л�4: 87.2
	}

}



