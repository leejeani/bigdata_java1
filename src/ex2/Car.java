package ex2;

import exception.MinusException;
import exception.OverFlowException;

public abstract class Car {
	protected int size;
	protected int currSize;
	public Car() {
	}
	public Car(int size, int currSize) {
		this.size = size;
		this.currSize = currSize;
	}
	public abstract void setOil(int s) throws
	MinusException,OverFlowException;
	
}











