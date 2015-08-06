package _A_factory._302_AbstractFactory;

public class SouthFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		// TODO Auto-generated method stub
		return new SouthApple();
	}

	@Override
	public Fruit getBanana() {
		// TODO Auto-generated method stub
		return new SouthBanana();
	}

}
