package creational;

public class Mac extends Device {
	
	private String ram;
	private String processor;
	
	
	
	public Mac(String ram, String processor) {
		
		this.ram = ram;
		this.processor = processor;
	}



	@Override
	public String toString() {
		return "Mac [ram=" + ram + ", processor=" + processor + "]";
	}



	@Override
	public String getConfiguration() {
		return "Mac config is Ram: "+this.ram+" and processor: "+this.processor;
	}
	
}
