package _A_Factory._104_SimpleFactory;

public class FruitFactory {
	/*
	 * 获得Apple类的实例
	 */
	public static Fruit getApple(){
		return new Apple();
	}
	
	/*
	 * 获得Banana类实例
	 */
	public static Fruit getBanana(){
		return new Banana();
	}
}
