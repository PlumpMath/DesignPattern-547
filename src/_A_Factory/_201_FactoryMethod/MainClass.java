package _A_Factory._201_FactoryMethod;

public class MainClass {

	/*
	 * 需要扩展程序，添加新的类（Pear）时，需要修改工厂类
	 * 不符合开放封闭原则。
	 * 
	 * 工厂方法模式同样属于类的创建型模式，又被称为多态工厂模式。工厂方法模式的意义
	 * 是定义一个创建产品对象的工厂接口，将实际创建工作推迟到子类当中。核心工厂类不
	 * 再负责产品的创建，这样核心类称为一个抽象工厂角色，仅负责具体工厂子类必须实现
	 * 的接口，这样进一步抽象化的好处是使得工厂方法模式可以使系统在不修改具体工厂角
	 * 色的情况下引进新的产品。
	 */
	public static void main(String[] args) {
		Fruit apple = FruitFactory.getFruit("Apple");
		Fruit banana = FruitFactory.getFruit("Banana");
		Fruit pear = FruitFactory.getFruit("Pear");
		apple.get();
		banana.get();
		pear.get();
	}
}
