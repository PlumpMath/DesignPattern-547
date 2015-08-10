package _A_Factory._202_FactoryMethod;

public class MainClass {
	public static void main(String[] args) {
		//好获得一个Apple()对象，需要先获得一个AppleFactory
		FruitFactory ffApple = new AppleFactory();
		//通过AppleFactory来获得Apple实力对象
		Fruit apple = ffApple.getFruit();
		apple.get();
		
		FruitFactory ffBanana = new BananaFactory();
		Fruit banana = ffBanana.getFruit();
		banana.get();
		
		/*
		 * 这样的话如果我需要新加入一个产品，比如Pear，我只需要创建类和相应的
		 * 工厂类就可以了。
		 */
		PearFactory ffPear = new PearFactory();
		Fruit pear = ffPear.getFruit();
		pear.get();
		
	}
}
