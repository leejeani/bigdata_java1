package exception;

public class MinusException extends Exception {
	public MinusException(){
		super("Minus Exception ...");
	}
	public MinusException(String str){
		super(str);
	}
}
