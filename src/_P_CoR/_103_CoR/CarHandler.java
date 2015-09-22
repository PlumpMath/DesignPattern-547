package _P_CoR._103_CoR;
/*
 * 组装车
 */
public abstract class CarHandler {
	protected CarHandler carHandler;//子类可以访问
	
	public CarHandler setNextHandler(CarHandler carHandler){
		this.carHandler = carHandler;
		return this.carHandler;
	}
	
	public abstract void handlerCar();
}
