package _A_Factory._103_SimpleFactory;

public class FruitFactory {
	/*
	 * ���Apple���ʵ��
	 */
	public Fruit getApple(){
		return new Apple();
	}
	
	/*
	 * ���Banana��ʵ��
	 */
	public Fruit getBanana(){
		return new Banana();
	}
}
