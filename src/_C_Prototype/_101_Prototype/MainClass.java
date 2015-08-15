package _C_Prototype._101_Prototype;
/*
 * 原型模式：
 * Prototype模式是一种对象创建型模式，它采取复制原型对象的方法来创建对象的实例。
 * 使用Prototype模式创建的实例，具有与原型一样的数据。
 */
public class MainClass {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("ZhangSan");
		person1.setAge(30);
		person1.setSex("男");
		
		Person person2 = new Person();
		person2.setName("LiSi");
		person2.setAge(30);
		person2.setSex("男");
		
		/*
		 * 我们需要创建多个对象，它们的数据只有少部分的属性不同。
		 * 我们是否可以通过复制对象的方式来实现呢
		 * 可以通过原型对象来实现
		 */
	}
}
