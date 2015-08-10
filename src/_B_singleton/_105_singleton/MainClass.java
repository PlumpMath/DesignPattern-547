package _B_singleton._105_singleton;

public class MainClass {
	
	/*
	 * 一般的使用方法中，一个类可以创建多个对象，每个对象的私有方法是不同的。
	 * 该如何保证只有一个对象呢？
	 * new操作符调用的是类的默认构造函数,把构造函数私有化，那么就不能用new来构造对象了
	 */
	public static void main(String[] args) {
		Person p1 = Person.getPerson();
		Person p2 = Person.getPerson();
		
		p1.setName("ZhangSan");
		p2.setName("LiSi");
		//只输出LiSi说明p1和p2指向同一个对象
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
