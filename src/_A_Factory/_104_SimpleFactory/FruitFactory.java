package _A_Factory._104_SimpleFactory;

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
