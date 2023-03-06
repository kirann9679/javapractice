package designpaterns_builder;

public class phoneBuilder {
	private String os1;
	private int ram;
	private String processor;
	private double screensize;
	private int battery;
	public phoneBuilder setOs(String os) {
		this.os1 = os;
		return this;
	}
	public phoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public phoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public phoneBuilder setScreensize(double screensize) {
		this.screensize = screensize;
		return this;
	}
	public phoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	
	public phone getphone() {
		return new phone(os1,ram,processor,screensize,battery);
		
	}
	
}
