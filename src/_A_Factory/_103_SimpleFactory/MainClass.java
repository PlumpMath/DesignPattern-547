package _A_Factory._103_SimpleFactory;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * һ��ʹ�÷�����
		 * ʵ����һ���࣬Ȼ����ö���ķ���
		 * 
		 */
		
		/*
  		//ʵ����һ��Apple
		Apple apple = new Apple();
		//ʵ����һ��Banana
		Banana banana = new Banana();
		
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * ��̬
		 */
		/*
		Fruit apple = new Apple();
		Fruit banana = new Banana();
		apple.get();
		banana.get();
		*/
		
		/*
		 * ʲô�Ǽ򵥹���ģʽ��
		 * �򵥹���ģʽ������Ĵ�����ģʽ���ֽ�����̬����ģʽ��ͨ��ר�Ŷ���һ����������
		 * �����������ʵ������������ʵ��ͨ�������й�ͬ�ĸ��ࡣ
		 * ������Apple��Banana���й�ͬ�ĸ���Fruit��
		 */
		
		FruitFactory fruiteFactory = new FruitFactory();
		Fruit apple = fruiteFactory.getApple();
		Fruit banana = fruiteFactory.getBanana();
		
		apple.get();
		banana.get();
		
	}
}
