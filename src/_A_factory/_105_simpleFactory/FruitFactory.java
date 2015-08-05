package _A_factory._105_simpleFactory;

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
	public static Fruit getFruit(String type){
		if(type.equalsIgnoreCase("apple")){
			return new Apple();
			//return Apple.class.newInstance();
		}else if(type.equalsIgnoreCase("banana")){
			return new Banana();
			//return Banana.class.newInstance();
		}else{
			System.out.println("�Ҳ�����Ӧ��ʵ������");
			return null;
		}
	}
}
