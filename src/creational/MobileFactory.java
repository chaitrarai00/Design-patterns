package creational;

public class MobileFactory extends AbstractDeviceFactory {
	

	@Override
	Device getdevice(DeviceType deviceType) {
		switch(deviceType) {
		case ONEPLUS:
			return new Oneplus("4gb","intel");
		case NOKIA:
			return new Nokia("8gb","intel");
		
		}
		return null;
	}
}
