package _O_Mediator._101_Mediator;
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
		Man zhangsan = new Man("张三",5);
		Man lisi = new Man("李四",6);
		
		Woman xiaofang = new Woman("小芳",6);
		
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		
		zhangsan.getPartner(lisi);
	}
}
