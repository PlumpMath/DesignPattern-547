package _P_CoR._103_CoR;

public class CarBodyHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("��װ����");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
