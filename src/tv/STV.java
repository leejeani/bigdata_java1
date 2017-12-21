package tv;

public class STV extends TV {
	private String network;
	private SettopBox sb;
	public STV() {
	}
	
	public STV(String power, int channel, String network, SettopBox sb) {
		super(power, channel);
		this.network = network;
		this.sb = sb;
	}
	@Override
	public String toString() {
		return "STV [network=" + network + ", sb=" + sb + ", power=" + power + ", channel=" + channel + "]";
	}
	
	public void networkOn(){
		this.network = "on";
	}
	public void networkOff(){
		this.network = "off";
	}

	@Override
	public void powerOn() {
		super.powerOn();
		sb.powerOn();
	}

	@Override
	public void powerOff() {
		super.powerOff();
		sb.powerOff();
	}
	
}














