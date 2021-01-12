package creational;

public class LaptopFactory extends AbstractDeviceFactory{
	

	@Override
	Device getdevice(DeviceType deviceType) {
		switch(deviceType) {
		case DELL:
			return new Dell("4gb","intel");
		case HP:
			return new Hp("8gb","intel");
		case MAC:
			return new Mac("8gp","amd");
		}
		return null;
	}
}
