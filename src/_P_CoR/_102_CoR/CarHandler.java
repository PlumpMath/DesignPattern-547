package _P_CoR._102_CoR;
/*
 * 组装车
 */
public abstract class CarHandler {
	protected CarHandler carHandler;//子类可以访问
	
	public void setNextHandler(CarHandler carHandler){
		this.carHandler = carHandler;
	}
	
	public abstract void handlerCar();
}
