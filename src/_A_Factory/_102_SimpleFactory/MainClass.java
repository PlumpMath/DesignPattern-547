package _A_Factory._102_SimpleFactory;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 一般使用方法：
		 * 实例化一个类，然后调用对象的方法
		 * 
		 */
		
		/*
  		//实例化一个Apple
		Apple apple = new Apple();
		//实例化一个Banana
		Banana banana = new Banana();
		
		apple.get();
		banana.get();
		*/
		
		
		/*
		 * 多态
		 */
		Fruit apple = new Apple();
		Fruit banana = new Banana();
		apple.get();
		banana.get();
		
	}
}
