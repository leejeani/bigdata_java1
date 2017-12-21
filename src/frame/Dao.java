package frame;

import java.util.DuplicateFormatFlagsException;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;

public abstract class Dao {
	public void connectDB(){
		System.out.println("Connect Database");
	}
	public void closeDB(){
		System.out.println("Close Database");
	}
	public abstract void insert(Object obj) 
			throws DuplicatedIDException;
	public abstract void delete(Object obj)
	        throws IDNotFoundException;
	public abstract void update(Object obj)
	        throws IDNotFoundException;
}






