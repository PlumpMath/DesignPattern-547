package _E_Decorator._104_Decorator;

public class RunCar implements Car{

	@Override
	public void run() {
		System.out.println("可以跑");
	}

	@Override
	public void show() {
		System.out.println("拥有的功能：");
		this.run();
	}

}
