package _E_Decorator._102_Decorator;

public class SwimCar implements Car{

	public void swim(){
		System.out.println("������");
	}

	@Override
	public void run() {
		System.out.println("������");
	}
	
	@Override
	public void show() {
		System.out.println("ӵ�еĹ��ܣ�");
		this.run();
		this.swim();
	}
}
