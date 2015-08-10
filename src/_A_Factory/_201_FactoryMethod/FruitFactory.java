package _A_Factory._201_FactoryMethod;

public class FruitFactory {

	/*
	 * get������������в�Ʒ����
	 */
	public static Fruit getFruit(String type){
		if(type.equalsIgnoreCase("apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("banana")){
			return new Banana();
		}else if(type.equalsIgnoreCase("pear")){
			return new Pear();
		}else{
			System.out.println("�Ҳ�����Ӧ��ʵ������");
			return null;
		}
	}
}
