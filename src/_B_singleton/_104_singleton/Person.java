package _B_singleton._104_singleton;

/*
 * 懒汉式实现方式
 * 1、创建静态引用
 * 2、在获取对象的静态方法中判断该静态引用是否已经赋值
 * 
 * 
 * 在单线程情况下懒汉式可以保证单例，多线程模式下是不可以的，
 * 饿汉式是可以的，因为对象是在类加载的时候创建的，无论单线程还是多线程，类只加载一次
 */
public class Person {
	private static Person person;
	
	private String name;

	/*
	 * 构造函数私有化
	 */
	private Person(){
		
	}
	
	/*
	 * 提供一个全局的*静态*方法。
	 * 如下的静态方法是不能达到单实例效果的
	 */
	public static Person getPerson(){
		if(person == null){
			person = new Person();
		}
		return person;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
