package creational;

public class Hp extends Device {
	
	private String ram;
	private String processor;
	
	
	
	public Hp(String ram, String processor) {
		
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "Hp [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getConfiguration() {
		return "Hp config is Ram: "+this.ram+" and processor: "+this.processor;
	}
	
}
