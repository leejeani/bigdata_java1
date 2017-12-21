package array;

public class Page192 {

	public static void main(String[] args) {
		int a = 10;
		
		int arr [] = null;
		arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		int temp [] = new int[10];
		
		System.arraycopy(arr, 0, temp, 3, arr.length);
		
		for(int data:temp){
			System.out.println(data);
		}
	}

}






