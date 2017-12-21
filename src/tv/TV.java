package tv;

public class TV {
	protected String power;
	protected int channel;
	public TV() {
	}
	public TV(String power, int channel) {
		this.power = power;
		this.channel = channel;
	}
	@Override
	public String toString() {
		return "TV [power=" + power + ", channel=" + channel + "]";
	}
	
	public void powerOn(){
		this.power = "on";
	}
	public void powerOff(){
		this.power = "off";
	}
	public void channelUp(){
		this.channel++;
	}
	public void channelDown(){
		this.channel--;
	}
}









