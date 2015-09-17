package _O_Mediator._102_Mediator;
/*
 * Mediator模式，是由GoF提出的23种软件设计模式的一种。Mediator模式是行为模式之一，
 * 在Mediator模式中，类之间的交互行为被统一放在Mediator的对象中，对象通过Mediator
 * 对象同其他对象交互，Mediator对象起着控制器的作用。
 */

/*
 * 模拟找对象，
 * 不使用中介者模式
 */
public class MainClass {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Man zhangsan = new Man("张三",5,mediator);
		Man lisi = new Man("李四",6,mediator);
		
		Woman xiaofang = new Woman("小芳",6,mediator);
		
		//zhangsan.getPartner(lisi);
		//这里判断男男配时，会导致空指针异常，因为zhangsan、lisi持有同一个Mediator，所以它们在调用
		//getPartner()时，都执行setMan()方法，这样导致Mediator对象中的Man属性的
		//值是最后调用getPartner的那个对象，并且setWoman()方法没有调用，woman属性
		//没有被设置
		
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		
		
	}
}
