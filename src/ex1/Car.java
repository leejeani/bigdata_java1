package ex1;

import exception.MinusException;
import exception.OverFlowException;

public class Car {
	private int size;
	private int currSize;
	public Car() {
	}
	public Car(int size, int currSize) {
		this.size = size;
		this.currSize = currSize;
	}
	@Override
	public String toString() {
		return "Car [size=" + size + ", currSize=" + currSize + "]";
	}
	public void setOil(int oil) throws OverFlowException, MinusException{
		if((this.currSize+oil) > size){
			throw new OverFlowException("EX100");
		}
		if(oil < 0){
			throw new MinusException("Ex101");
		}
		this.currSize += oil;
	}
}









