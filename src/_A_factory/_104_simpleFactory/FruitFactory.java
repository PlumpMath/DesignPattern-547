package _A_factory._104_simpleFactory;

public class FruitFactory {
	/*
	 * ���Apple���ʵ��
	 */
	public static Fruit getApple(){
		return new Apple();
	}
	
	/*
	 * ���Banana��ʵ��
	 */
	public static Fruit getBanana(){
		return new Banana();
	}
}
