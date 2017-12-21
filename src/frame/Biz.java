package frame;

import exception.DuplicatedIDException;
import exception.IDNotFoundException;

public abstract class Biz {
	public void startTR(){
		System.out.println("Start Transaction");
	}
	public void endTR(){
		System.out.println("End Transaction");
	}
	public abstract void register(Object obj)
			 throws DuplicatedIDException;
	public abstract void remove(Object obj)
			 throws IDNotFoundException;
	public abstract void modify(Object obj) 
			 throws IDNotFoundException;
}







