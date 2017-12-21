package array;

public class Page182 {

	public static void main(String[] args) {
		int a = 0;
		int arr [] = {1,2,3};
		int arr2 [] = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		System.out.println(arr2.length);
		System.out.println("-----------------");
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------");
		for(int tmp:arr2){
			System.out.println(tmp);
		}
	}

}





