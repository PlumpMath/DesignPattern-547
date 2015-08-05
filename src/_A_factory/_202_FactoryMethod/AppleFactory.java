package _A_factory._202_FactoryMethod;

public class AppleFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
