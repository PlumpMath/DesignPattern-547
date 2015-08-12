package _E_Decorator._102_Decorator;
/*
 * 装饰(Decorator)模式又叫做包装模式，通过一种对客户端透明的方式来扩展对象的功能，
 * 是继承关系的一个替代方案。
 */
public class MainClass {
	public static void main(String[] args) {
		Car flyBus = new FlyCar();
		flyBus.show();
		
		/*
		 * 这种方式虽然可以实现单独创建具有某种功能的对象，
		 * 但是如果又有一种新车，既能飞又能游，那我们需要重新创建一个类。
		 * 这时我们就可以使用装饰模式，它可以扩展对象的功能，可以替换继承关系
		 */
	}
}
