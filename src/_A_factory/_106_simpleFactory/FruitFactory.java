package _A_factory._106_simpleFactory;

public class FruitFactory {
//	/*
//	 * ���Apple���ʵ��
//	 */
//	public static Fruit getApple(){
//		return new Apple();
//	}
//	
//	/*
//	 * ���Banana��ʵ��
//	 */
//	public static Fruit getBanana(){
//		return new Banana();
//	}
	
	/*
	 * get������������в�Ʒ����
	 */
//	public static Fruit getFruit(String type){
//		if(type.equalsIgnoreCase("apple")){
//			return new Apple();
//		}else if(type.equalsIgnoreCase("banana")){
//			return new Banana();
//		}else{
//			System.out.println("�Ҳ�����Ӧ��ʵ������");
//			return null;
//		}
//	}
	
	/*
	 * ��һ��ʵ�ַ�ʽ
	 */
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//Class.forName() only accepts fully-qualified names
		//Class.forName()����ָ�������İ���
		Class<?> fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
