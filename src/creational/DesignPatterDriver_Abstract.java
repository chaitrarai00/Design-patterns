package creational;

public class DesignPatterDriver_Abstract {
/*
 * Its done by adding layers on the factory pattern
 * its mentioned or said to be Factory of Factories
 * u get the FactoryInstance from the factory and
 *  then the respective device  instance from underlying abstract method
 */
	public static void main(String[] args) {
		Device device=FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getdevice(DeviceType.ONEPLUS);
		System.out.print(device.getConfiguration());
	}

}
