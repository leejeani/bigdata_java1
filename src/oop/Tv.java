package oop;

public class Tv {
	// Member variable
	private String color;
	private boolean power;
	private int channel;
	
	// Constructor
	public Tv(){
		color = "black";
		power = false;
		channel = 0;
	}
	
	public Tv(String color, boolean power, int channel) {
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	// getter, setter
	public String getColor() {
		return color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	// Member Function
	public void powerOn(){
		power = true;
	}
	public void powerOff(){
		power = false;
	}
	public void channelUp(int channel){
		if(channel <= 0){
			System.out.println("Input Error....");
			return;
		}
		this.channel = this.channel + channel;
	}
	public void channelDown(int channel){
		if(channel <= 0 ){
			System.out.println("음수는 안됩니다.");
			return;
		}
		if(this.channel - channel < 0){
			System.out.println("범위를 넘어 섰습니다.");
			return;
		}
		this.channel = this.channel - channel;
	}

	@Override
	public String toString() {
		return "Tv* [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
}





