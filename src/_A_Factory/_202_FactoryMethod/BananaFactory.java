package _A_Factory._202_FactoryMethod;

public class BananaFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		// TODO Auto-generated method stub
		return new Banana();
	}

}
