package _E_Decorator._104_Decorator;
/*
 * 装饰(Decorator)模式又叫做包装模式，通过一种对客户端透明的方式来扩展对象的功能，
 * 是继承关系的一个替代方案。
 */
public class MainClass {
	public static void main(String[] args) {
//		Car runCar = new RunCar();
//		//runCar.show();
//		
//		//CarDecorator carDecorator = new FlyCarDecorator(runCar);
//		CarDecorator carDecorator = new SwimCarDecorator(runCar);
//		carDecorator.show();
		
		/*
		 * 如果要实现既能飞又能游的车该如何实现呢？
		 * 要新建一个FlySwimCarDecorator吗？
		 * 能否通过在已经被装饰过的对象上增加其他装饰呢，比如在可以飞的对象上增加可以游的功能呢？
		 * 我们需要将CarDecorator实现Car接口，让CarDecorator也具有Car接口功能,
		 * 这样的话添加新功能后它还是Car
		 */
		
		Car car = new RunCar();
		
		Car swimCar = new SwimCarDecorator(car);
		Car flySwimCar = new FlyCarDecorator(swimCar);
		flySwimCar.show();
	
	}
}

/*
 * 装饰模式的角色和职责：
 * 抽象组件角色：一个抽象接口，是被装饰类和装饰类的父接口。
 * 具体组件角色：为抽象组件的实现类
 * 抽象装饰角色：包含一个组件的引用，并定义了与抽象组件一致的接口；
 * 具体装饰角色：为抽象装饰角色的实现类，负责具体的装饰
 */
