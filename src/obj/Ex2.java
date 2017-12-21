package obj;

import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		Value v1 = new Value(100);
		Value v2 = v1.clone();
		v2.data = 200;
		System.out.println(v1);
		System.out.println(v2);
		if(v1 == v2){
			System.out.println("v1 == v2");
		}
		
		
		int arr [] = {1,2,3};
		int arr2 [] = {0,0,0,0,0,0};
		
		System.arraycopy(arr, 0, arr2, 1, arr.length);
		
		System.out.println(Arrays.toString(arr2));
	}

}






