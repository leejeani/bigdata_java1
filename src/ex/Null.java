package ex;

public class Null {

	public static void main(String[] args) {
		String s = null;
		int size = 0;
		try{
			size = s.length();
		}catch(NullPointerException e){
			System.out.println("���ڰ� �����ϴ�.");
		}
		System.out.println(size);
		
		int a [] = new int[3];
		for(int i=0;i<=a.length;i++){
			try{
				System.out.println(a[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("�迭 ����");
			}
		}
	}

}



