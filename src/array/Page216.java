package array;

public class Page216 {

	public static void main(String[] args) {
		int students [][] = {
			{100,95,80,77},
			{90,91,63,70},
			{81,70,89,72},
			{74,85,100,93}
		};
		// 우리반 학생의 전체 평균과
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
		// 각 학생들의 평균을 출력 하시오
		
		
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
			System.out.printf("학생 %d:%f\n",
					i,student[i]);
		}
		
		// 전체 평균: 89.20
		// 학생1: 89.2
		// 학생2: 78.2
		// 학생3: 98.2
		// 학생4: 87.2
	}

}



