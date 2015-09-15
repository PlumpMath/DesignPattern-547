package _C_Prototype._103_Prototype;

import java.util.ArrayList;

/*
 * 原型模式：
 * Prototype模式是一种对象创建型模式，它采取复制原型对象的方法来创建对象的实例。
 * 使用Prototype模式创建的实例，具有与原型一样的数据。
 */
public class MainClass {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setName("ZhangSan");
//		person1.setAge(30);
//		person1.setSex("男");
//		
//		Person person2 = new Person();
//		person2.setName("LiSi");
//		person2.setAge(30);
//		person2.setSex("男");
//		
//		/*
//		 * 我们需要创建多个对象，它们的数据只有少部分的属性不同。
//		 * 我们是否可以通过复制对象的方式来实现呢
//		 * 可以通过原型对象来实现
//		 */
		
//		Person person1 = new Person();
//		person1.setName("ZhangSan");
//		person1.setAge(30);
//		person1.setSex("男");
		
		/*
		 * 引用赋值和clone是完全不同的。
		 * 引用赋值是两个引用执行同一个对象；
		 * 而clone是指向不同的对象
		 */
		//Person person2 = person1
//		Person person2 = person1.clone();
//		
//		person1.setName("张三");
//		System.out.println(person2.getName());
		
		/*
		 * 根据对象克隆深度层次的不同，有浅度克隆与深度克隆。
		 * 浅度克隆只克隆数值型变量，对于引用变量不会克隆，仍然持有相同的引用。
		 * 深度克隆会将对象中的引用类型变量也克隆
		 */
		
		Person person1 = new Person();
		person1.setName("ZhangSan");
		person1.setAge(30);
		person1.setSex("男");
		ArrayList<String> friends = new ArrayList<>();
		friends.add("James");
		friends.add("Kobe");
		person1.setFriends(friends);
		
		Person person2 = person1.clone();
		
		friends.add("Mac");
		person1.setFriends(friends);
		//修改一个对象中的引用类型变量，会改变另外克隆得到的对象
		//说明这些引用指向同一个对象
		//该如何实现深度克隆呢？
		
		System.out.println("Person1的Friends:" + person1.getFriends());
		System.out.println("Person2的Friends:" + person2.getFriends());
		
		
	}
}
