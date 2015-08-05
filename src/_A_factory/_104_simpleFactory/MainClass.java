package _A_factory._104_simpleFactory;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 一般使用方法：
		 * 实例化一个类，然后调用对象的方法
		 * 
		 */
		
		/*
  		//实例化一个Apple
		Apple apple = new Apple();
		//实例化一个Banana
		Banana banana = new Banana();
		
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * 多态
		 */
		/*
		Fruit apple = new Apple();
		Fruit banana = new Banana();
		apple.get();
		banana.get();
		*/
		
		/*
		 * 什么是简单工厂模式：
		 * 简单工厂模式属于类的创建型模式，又叫做静态工厂模式。通过专门定义一个类来负责
		 * 创建其他类的实例，被创建的实例通常都具有共同的父类。
		 * 本例中Apple和Banana具有共同的父类Fruit。
		 */
		/*
		FruitFactory fruiteFactory = new FruitFactory();
		Fruit apple = fruiteFactory.getApple();
		Fruit banana = fruiteFactory.getBanana();
		
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * 如何继续简化呢？
		 * 现在每次都需要创建一个工厂类的实例，我们可以将工厂类中的方法声明为static
		 * 这样就可以直接调用方法生成所需实例。
		 */
		
		Fruit apple = FruitFactory.getApple();
		Fruit banana = FruitFactory.getBanana();
		apple.get();
		banana.get();
		
	}
}
