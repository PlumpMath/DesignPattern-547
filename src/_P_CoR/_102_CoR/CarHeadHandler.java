package _P_CoR._102_CoR;

public class CarHeadHandler extends CarHandler{

	@Override
	public void handlerCar() {
		System.out.println("��װ��ͷ");
		if (this.carHandler != null) {
			this.carHandler.handlerCar();
		}
	}

}
