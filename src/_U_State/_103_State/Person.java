package _U_State._103_State;

public class Person {
	private int hour;
	
	private State state;

	public Person(){
		state = new MState();
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	/*
	 * Ҫ��״̬�ж��߼�ת�Ƶ���Ӧ��״̬���У�����"����͡�����͡�δ����"����һ��״̬
	 * ������Ҫ������Ӧ��״̬��
	 */
	/*
	 public void doSomething(){
		if (hour == 7) {
			System.out.println("�����");
		}else if (hour == 12) {
			System.out.println("�����");
		}else if (hour == 18) {
			System.out.println("�����");
		}else{
			System.out.println("δ����");
		}
	}
	*/
	
	public void doSomething(){
		//�ж��߼����Ƿ����������
		state.stateChange(this);
	
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
