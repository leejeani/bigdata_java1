package obj;

public class Value implements Cloneable {
	int data;
	Point p;
	
	public Value(){}
	
	public Value(int data) {
		this.data = data;
	}
	

	public Value(int data, Point p) {
		this.data = data;
		this.p = p;
	}


	
	@Override
	public String toString() {
		return "Value [data=" + data + ", p=" + p + "]";
	}


	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Value){
			if(data == ((Value)obj).data){
				result = true;
			}else{
				result = false;
			}
		}else{
			result = false;
		}
		return result;
	}
	
	public Value clone(){
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (Value)obj;
	}
	
}




