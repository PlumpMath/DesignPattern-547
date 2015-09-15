package _U_State._104_State;
/*
 * Moring State
 */
public class LState extends State {

	@Override
	public void stateChange(Person person) {
		if (person.getHour() == 12) {
			System.out.println("�����");
		}else{
			person.setState(new SState());
			person.doSomething();
		}
	}
}
