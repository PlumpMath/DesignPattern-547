package _P_CoR._103_CoR;
/*
 * ��װ��
 */
public abstract class CarHandler {
	protected CarHandler carHandler;//������Է���
	
	public CarHandler setNextHandler(CarHandler carHandler){
		this.carHandler = carHandler;
		return this.carHandler;
	}
	
	public abstract void handlerCar();
}
