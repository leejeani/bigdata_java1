package exception;

public class OverFlowException extends Exception {
	public OverFlowException(){
		super("OverFlow Exception ...");
	}
	public OverFlowException(String str){
		super(str);
	}
}
