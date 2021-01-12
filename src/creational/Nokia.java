package creational;

public class Nokia extends Device {
	
	private String ram;
	private String processor;
	
	
	
	public Nokia(String ram, String processor) {
		
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "Nokia [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getConfiguration() {
		return "Nokia config is Ram: "+this.ram+" and processor: "+this.processor;
	}
	
}
