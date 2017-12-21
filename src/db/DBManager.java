package db;

public class DBManager {
	public static DB getDB(String str){
		DB db = null;
		switch(str){
		case "oracle":
			db = new OracleDB("100.1.20.30");
			break;
		case "maria":
			db = new MariaDB("100.1.20.31");
			break;
		}
		return db;
	}
}
