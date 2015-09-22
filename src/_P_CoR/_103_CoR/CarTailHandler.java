package _P_CoR._103_CoR;

public class CarTailHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("×é×°³µÎ²");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
