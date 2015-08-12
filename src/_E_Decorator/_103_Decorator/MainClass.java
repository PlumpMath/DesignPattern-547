package _E_Decorator._103_Decorator;
/*
 * 装饰(Decorator)模式又叫做包装模式，通过一种对客户端透明的方式来扩展对象的功能，
 * 是继承关系的一个替代方案。
 */
public class MainClass {
	public static void main(String[] args) {
		Car runCar = new RunCar();
		//runCar.show();
		
		//CarDecorator carDecorator = new FlyCarDecorator(runCar);
		CarDecorator carDecorator = new SwimCarDecorator(runCar);
		carDecorator.show();
	}
}
