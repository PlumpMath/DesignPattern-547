package _A_factory._103_simpleFactory;

public class FruitFactory {
	/*
	 * 获得Apple类的实例
	 */
	public Fruit getApple(){
		return new Apple();
	}
	
	/*
	 * 获得Banana类实例
	 */
	public Fruit getBanana(){
		return new Banana();
	}
}
