package _V_Command._104_Command;
/*
 * 命令模式的流程最终是要调用被调用对象的方法
 * 现在封装了一个命令类，而要调用被调用对象(Receiver)的方法，所以这个命令类要保存一个被调用对象的实例引用
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
