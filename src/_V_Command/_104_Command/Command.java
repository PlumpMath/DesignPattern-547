package _V_Command._104_Command;
/*
 * ����ģʽ������������Ҫ���ñ����ö���ķ���
 * ���ڷ�װ��һ�������࣬��Ҫ���ñ����ö���(Receiver)�ķ������������������Ҫ����һ�������ö����ʵ������
 */
public abstract class Command {
	private Paddler paddler;
	
	public Command(Paddler paddler) {
		super();
		this.paddler = paddler;
	}

	public Paddler getPaddler() {
		return paddler;
	}

	public void setPaddler(Paddler paddler) {
		this.paddler = paddler;
	}

	public abstract void sell();
}
