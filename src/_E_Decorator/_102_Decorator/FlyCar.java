package _E_Decorator._102_Decorator;

public class FlyCar implements Car{
	public void fly(){
		System.out.println("可以飞");
	}

	@Override
	public void run() {
		System.out.println("可以跑");
	}
	
	@Override
	public void show() {
		System.out.println("拥有的功能：");
		this.run();
		this.fly();
	}

	
}
