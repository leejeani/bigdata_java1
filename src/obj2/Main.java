package obj2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import static java.lang.System.out;


import obj.Obj;

public class Main {

	public static void main(String[] args) {
		Obj oc = new Obj();
		String str = new String("");
		Random r = new Random();
		int a = 10;
		int b = 20;
		// ���̰� a�̰� 
		// ���ΰ� b�� �ﰢ���� �ִ�.
		// �ﰢ���� �ѷ��� ���Ͻÿ�.
		// c2 = a2 + b2
		// c = ��Ʈ a2 + b2
		int c = 
		(int)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println(c);
		
		
		Date d = new Date();
		SimpleDateFormat date = 
				new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = 
				new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(d));
		System.out.println(time.format(d));
		
		out.println("aa");
	}
	

}







