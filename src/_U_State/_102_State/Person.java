package _U_State._102_State;

public class Person {
	private int hour;
	
	private State state;

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
		if (hour == 7) {
			state = new MState();
			state.stateChange();
		}else if (hour == 12) {
			state = new LState();
			state.stateChange();
		}else if (hour == 18) {
			state = new SState();
			state.stateChange();
		}else{
			state = new NoState();
			state.stateChange();
		}
	}
}
