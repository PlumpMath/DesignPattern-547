package _S_Memento._103_Memento;
/*
 * Caretaker(������)
 * �������ʵ���ʱ�䱣��/�ָ�Originator�����״̬
 * 
 * ����Caretaker�ĺô����е����Ķ���������memento
 */
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
