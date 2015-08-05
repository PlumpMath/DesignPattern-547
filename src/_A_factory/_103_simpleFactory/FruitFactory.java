package _A_factory._103_simpleFactory;

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
