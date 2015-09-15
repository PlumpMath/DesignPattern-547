package _A_Factory._302_AbstractFactory;

public class WenShiFruitFactory implements FruitFactory {

	@Override
	public Fruit getApple() {
		return new WenShiApple();
	}

	@Override
	public Fruit getBanana() {
		return new WenShiBanana();
	}

}
