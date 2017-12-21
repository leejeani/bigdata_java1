package ex;

import java.io.IOException;
import java.net.ServerSocket;

public class Zero {

	public static void main(String[] args) {
		// 1. Runtime Exception ...
		int a = 10;
		int result = 0;
		for(int i=0;i<10;i++){
			int b = (int)(Math.random()*10);
			if(b == 0){
				continue;
			}
			result = a / b;
			
			System.out.println(result);
		}
		
		// 2. Code Exception ...
		ServerSocket socket = null;
		try {
			socket = new ServerSocket(1000);
			socket.accept();
			Thread.sleep(1000);
		} catch (IOException e) {
			// Retry...
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				socket.close();
			} catch (IOException e) {
			
			}
		}
		System.out.println("Socket End ...");
		// 3. User Define Exception ...
		// 특정 업무
		// 잔고 부족 Exception
		// NotEnoughBalanceException
		
		
	}

}



