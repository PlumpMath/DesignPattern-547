package _P_CoR._102_CoR;

public class CarTailHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("×é×°³µÎ²");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
