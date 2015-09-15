package _B_Singleton._101_Singleton;

public class MainClass {
	
	/*
	 * 一般的使用方法中，一个类可以创建多个对象，每个对象的私有方法是不同的。
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("ZhangSan");
		p2.setName("LiSi");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
