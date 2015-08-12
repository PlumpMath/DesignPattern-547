package _E_Decorator._104_Decorator;
/*
 * 装饰器，类似于汽车加工厂，可以给车添加新的功能。
 * 它本身需要持有一个被装饰对象的引用
 */
public abstract class CarDecorator implements Car{
	private Car car;
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarDecorator(Car car){
		this.car = car;
	} 
	
	public abstract void show();
}
