package _B_singleton._103_singleton;

/*
 *  单例模式饿汉式实现方式
 *  1、私有化构造函数
 *  2、创建对象赋值给静态变量
 *  3、静态方法将该静态变量返回
 *  
 */
public class Person {
	
	//静态语句仅在类第一次加载的时候执行的
	public static final Person person = new Person();
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
		return person;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
