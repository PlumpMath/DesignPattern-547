package _E_Decorator._103_Decorator;

public class RunCar implements Car{

	@Override
	public void run() {
		System.out.println("������");
	}

	@Override
	public void show() {
		System.out.println("ӵ�еĹ��ܣ�");
		this.run();
	}

}
