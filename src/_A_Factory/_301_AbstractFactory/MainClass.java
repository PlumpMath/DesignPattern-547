package _A_Factory._301_AbstractFactory;

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
	}
}
