package _A_Factory._102_SimpleFactory;

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
		Fruit apple = new Apple();
		Fruit banana = new Banana();
		apple.get();
		banana.get();
		
	}
}
