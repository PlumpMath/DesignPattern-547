package _E_Decorator._103_Decorator;

public class SwimCarDecorator extends CarDecorator{

	public SwimCarDecorator(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		this.getCar().show();
		this.swim();
	}
	
	public void swim(){
		System.out.println("©иртсн");
	}

}
