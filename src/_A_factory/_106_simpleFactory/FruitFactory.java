package _A_factory._106_simpleFactory;

public class FruitFactory {
//	/*
//	 * 获得Apple类的实例
//	 */
//	public static Fruit getApple(){
//		return new Apple();
//	}
//	
//	/*
//	 * 获得Banana类实例
//	 */
//	public static Fruit getBanana(){
//		return new Banana();
//	}
	
	/*
	 * get方法，获得所有产品对象
	 */
//	public static Fruit getFruit(String type){
//		if(type.equalsIgnoreCase("apple")){
//			return new Apple();
//		}else if(type.equalsIgnoreCase("banana")){
//			return new Banana();
//		}else{
//			System.out.println("找不到相应的实例化类");
//			return null;
//		}
//	}
	
	/*
	 * 另一种实现方式
	 */
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//Class.forName() only accepts fully-qualified names
		//Class.forName()必须指定完整的包名
		Class<?> fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
