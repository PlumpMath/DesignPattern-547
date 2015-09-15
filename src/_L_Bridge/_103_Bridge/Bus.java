package _L_Bridge._103_Bridge;

public class Bus extends Car{

	public Bus(Engine engine) {
		super(engine);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void installEngine() {
		System.out.println("Bus:");
		this.getEngine().installEngine();//通过持有的发动机对象来调用
	}

}
