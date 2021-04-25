package wrok1;

public class SuperFactory implements AbstractFactory {
	
	@Override
	public Phone createPhone(String param) {
		return new iPhone();
	}
	@Override
	public Car createCar(String param) {
		return new AE86();
	}
}
