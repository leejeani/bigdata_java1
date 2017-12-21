package db;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class App {

	public static void main(String[] args) {
		DB db = DBManager.getDB("oracle");
		Scanner sc = new Scanner(System.in);
		mypoint:
		while(true){
			System.out.println("MENU(i,d,u,s,q)..");
			String menu = sc.next();
			String id = null;
			String pwd = null;
			String name = null;
			User user = null;
			
			switch(menu){
			case "i":
				System.out.println("User 정보를 입력 하세요..");
				id = sc.next();
				pwd = sc.next();
				name = sc.next();
				user = new User(id, pwd, name);
				db.insert(user);
				break;
			case "d":
				System.out.println("ID 입력 하세요..");
				id = sc.next();
				db.delete(id);
				break;
			case "u":
				System.out.println("수정 할 User 정보를 입력 하세요..");
				id = sc.next();
				pwd = sc.next();
				name = sc.next();
				user = new User(id, pwd, name);
				db.update(user);
				break;
			case "q":
				sc.close();
				break mypoint;
			case "s":
				System.out.println("조회 할 ID를 입력 하세요");
				id = sc.next();
				user = (User) db.select(id);
				System.out.println(user);
				break;
			default:
				break;
			} // end switch
		} // end while
		
		System.out.println("Bye .. ");
		
	}

}



