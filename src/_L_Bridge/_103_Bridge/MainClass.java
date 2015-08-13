package _L_Bridge._103_Bridge;
/*
 * 什么是桥接模式
 * 
 * Bridge模式是构造型的设计模式之一，Bridge模式基于类的最小设计原则，通过使用封装、聚合以及
 * 继承等行为来让不同的类承担不同的责任，它的主要特点是把抽象(abstraction)与行为实现(implementation)
 * 分离开来，从而可以保持各部分的独立性以及应对它们的功能扩展。
 */
public class MainClass {
	public static void main(String[] args) {

		
		/*
		 * 对于每种类别多种实现的程序设计，增加新的类别或者规格，需要呈几何级的增加类。
		 * 我们需要另一种实现
		 */
		
		/*
		 * 我们可以将方法全部封装到接口中，这样的话就可以减少很多类
		 */
//		Bus bus = new Bus();
//		bus.install2000Engine();
		
		/*
		 * 这样的弊端是，如果新增类别或者规格时，需要修改类的接口和其实现，不符合开放封闭原则。
		 * 另外就是如果某些类别中没有某一个规格，那么就必须在类中增加相应的空实现
		 */
		
		/*
		 * 我们可以使用桥接模式。
		 * 其中行为实现就相当于安装发动机，抽象就是Car
		 */
		
		Engine2000 engine2000 = new Engine2000();
		Engine2200 engine2200 = new Engine2200();
		
		Bus bus = new Bus(engine2000);
		Jeep jeep = new Jeep(engine2200);
		bus.installEngine();
		jeep.installEngine();
		
		/*
		 * 这样的话如果需要添加新的类别只需继承Car，增加新的规格只需实现Engine接口
		 */
		
	}
}
