package _A_Factory._201_FactoryMethod;

public class FruitFactory {

	/*
	 * get方法，获得所有产品对象
	 */
	public static Fruit getFruit(String type){
		if(type.equalsIgnoreCase("apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("banana")){
			return new Banana();
		}else if(type.equalsIgnoreCase("pear")){
			return new Pear();
		}else{
			System.out.println("找不到相应的实例化类");
			return null;
		}
	}
}
