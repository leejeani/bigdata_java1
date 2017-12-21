package tv;

public class SettopBox {
	private String power;
	public SettopBox(){
	}
	public SettopBox(String power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "SettopBox [power=" + power + "]";
	}
	public void powerOn(){
		this.power = "on";
	}
	public void powerOff(){
		this.power = "off";
	}
	
}





