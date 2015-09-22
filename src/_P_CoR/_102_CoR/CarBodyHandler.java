package _P_CoR._102_CoR;

public class CarBodyHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("组装车身");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
