package _E_Decorator._103_Decorator;

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
}
