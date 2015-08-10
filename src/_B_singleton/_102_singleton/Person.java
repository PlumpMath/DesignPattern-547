package _B_singleton._102_singleton;

public class Person {
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
	static Person getPerson(){
		return new Person();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
