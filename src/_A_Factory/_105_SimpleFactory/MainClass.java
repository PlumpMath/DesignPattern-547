package _A_Factory._105_SimpleFactory;

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
		/*
		FruitFactory fruiteFactory = new FruitFactory();
		Fruit apple = fruiteFactory.getApple();
		Fruit banana = fruiteFactory.getBanana();
		
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * ��μ������أ�
		 * ����ÿ�ζ���Ҫ����һ���������ʵ�������ǿ��Խ��������еķ�������Ϊstatic
		 * �����Ϳ���ֱ�ӵ��÷�����������ʵ����
		 */
		/*
		Fruit apple = FruitFactory.getApple();
		Fruit banana = FruitFactory.getBanana();
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * �����ʵ��̫���ԣ���μ����Ż��أ�
		 * ���湤����ÿ����������ɶ���Ҫһ��������
		 */
		Fruit apple = FruitFactory.getFruit("apple");
		Fruit banana = FruitFactory.getFruit("banana");
		apple.get();
		banana.get();
		
	}
}