package _E_Decorator._102_Decorator;

public class FlyCar implements Car{
	public void fly(){
		System.out.println("���Է�");
	}

	@Override
	public void run() {
		System.out.println("������");
	}
	
	@Override
	public void show() {
		System.out.println("ӵ�еĹ��ܣ�");
		this.run();
		this.fly();
	}

	
}
