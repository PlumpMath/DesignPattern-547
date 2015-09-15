package _E_Decorator._104_Decorator;

public class FlyCarDecorator extends CarDecorator{
	
	public FlyCarDecorator(Car car) {
		super(car);
	}
	
	public void show(){
		this.getCar().show();
		this.fly();
	}
	
	//����¹���
	public void fly(){
		System.out.println("���Է�");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
