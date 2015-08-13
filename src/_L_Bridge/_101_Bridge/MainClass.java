package _L_Bridge._101_Bridge;
/*
 * 什么是桥接模式
 * 
 * Bridge模式是构造型的设计模式之一，Bridge模式基于类的最小设计原则，通过使用封装、聚合以及
 * 继承等行为来让不同的类承担不同的责任，它的主要特点是把抽象(abstraction)与行为实现(implementation)
 * 分离开来，从而可以保持各部分的独立性以及应对它们的功能扩展。
 */
public class MainClass {
	public static void main(String[] args) {
		Car car = new Bus2000();
		car.installEngine();
		
		/*
		 * 对于每种类别多种实现的程序设计，增加新的类别或者规格，需要呈几何级的增加类。
		 * 我们需要另一种实现
		 */
	}
}
