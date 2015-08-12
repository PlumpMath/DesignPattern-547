package _E_Decorator._102_Decorator;

public class SwimCar implements Car{

	public void swim(){
		System.out.println("可以游");
	}

	@Override
	public void run() {
		System.out.println("可以跑");
	}
	
	@Override
	public void show() {
		System.out.println("拥有的功能：");
		this.run();
		this.swim();
	}
}
