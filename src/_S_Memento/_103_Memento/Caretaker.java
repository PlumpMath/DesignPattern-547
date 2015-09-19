package _S_Memento._103_Memento;
/*
 * Caretaker(管理者)
 * 负责在适当的时间保存/恢复Originator对象的状态
 * 
 * 引入Caretaker的好处是有单独的对象来管理memento
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
