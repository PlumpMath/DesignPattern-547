package _P_CoR._103_CoR;

public class CarTailHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("��װ��β");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
