package _A_Factory._201_FactoryMethod;

public interface Fruit {
	/*
	 * 因为 Apple和 Banana 有相同的方法get
	 * 所以可以抽象出一个接口
	 * 
	 * 
	 * 这样在实例化对象是可以实现多态
	 */
	
	/*
	 * 采集
	 */
	public void get();

}
