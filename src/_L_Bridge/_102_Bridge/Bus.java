package _L_Bridge._102_Bridge;

public class Bus implements Car{

	@Override
	public void install2000Engine() {
		System.out.println("Bus安装2000CC发动机");
	}

	@Override
	public void install2200Engine() {
		System.out.println("Bus安装2200CC发动机");		
	}

	@Override
	public void install2400Engine() {
		System.out.println("Bus安装2400CC发动机");		
	}

}
