package _P_CoR._102_CoR;
/*
 * ��װ��
 */
public abstract class CarHandler {
	protected CarHandler carHandler;//������Է���
	
	public void setNextHandler(CarHandler carHandler){
		this.carHandler = carHandler;
	}
	
	public abstract void handlerCar();
}
