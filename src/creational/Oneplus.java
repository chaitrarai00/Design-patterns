package creational;

public class Oneplus extends Device {
	
	private String ram;
	private String processor;
	
	
	
	public Oneplus(String ram, String processor) {
		
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "Oneplus [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getConfiguration() {
		return "Oneplus config is Ram: "+this.ram+" and processor: "+this.processor;
	}
	
}
