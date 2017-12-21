package ex2;

import exception.MinusException;
import exception.OverFlowException;

public class MyCar extends Car {
	public MyCar(){}
	public MyCar(int size, int currSize){
		super(size, currSize);
	}
	
	@Override
	public void setOil(int s) throws 
	MinusException, OverFlowException {
		
	}

}
