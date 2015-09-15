package _U_State._104_State;
/*
 * Moring State
 */
public class MState extends State {

	@Override
	public void stateChange(Person person) {
		if (person.getHour() == 7) {
			System.out.println("≥‘‘Á≤Õ");
		}else{
			person.setState(new LState());
			person.doSomething();
		}
		
	}

}
