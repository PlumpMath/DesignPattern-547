package _U_State._103_State;
/*
 * Moring State
 */
public class SState extends State {

	@Override
	public void stateChange(Person person) {
		if (person.getHour() == 18) {
			System.out.println("≥‘ÕÌ≤Õ");
		}else{
			person.setState(new NoState());
			person.doSomething();
		}
		
	}

}
