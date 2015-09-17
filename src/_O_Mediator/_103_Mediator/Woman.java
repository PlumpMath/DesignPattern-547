package _O_Mediator._103_Mediator;

public class Woman extends Person{

	public Woman(String name, int condition,Mediator mediator) {
		super(name, condition, mediator);

	}

	@Override
	public void getPartner(Person person) {
		this.getMediator().setWoman(this);
		this.getMediator().getPartner(person);
	}
}
