package _A_factory._302_AbstractFactory;

public class MainClass {
	public static void main(String[] args) {
		FruitFactory ffNorth = new NorthFruitFactory();
		Fruit apple = ffNorth.getApple();
		apple.get();
		
		Fruit banana = ffNorth.getBanana();
		banana.get();
		
		FruitFactory ffSouth = new SouthFruitFactory();
		Fruit apple2 = ffSouth.getApple();
		apple2.get();
		
		Fruit banana2 = ffSouth.getBanana();
		banana2.get();
		
		//如果需要添加新的产品，比如Apple的子类 WenShiApple,Banana的子类WenShiBanana
		//那么久只需要新建产品类和相应的工厂类
		FruitFactory ffWenShi = new WenShiFruitFactory();
		Fruit apple3 = ffWenShi.getApple();
		apple3.get();
		Fruit banana3 = ffWenShi.getBanana();
		banana3.get();
		
		/*
		 * 抽象工厂的缺点：
		 * 如果需要添加一个新的产品等级，比如需要增加一个Pear，
		 * 就需要每一个具体的工厂都要实现这个方法。
		 * 从产品等级来看 抽象工厂模式就不符合OCP（开放-闭合）原则
		 */
		
	}
}
