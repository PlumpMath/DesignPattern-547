package _V_Command._103_Command;

public class AppleCommand extends Command{
	
	public AppleCommand(Paddler paddler) {
		super(paddler);
	}

	@Override
	public void sell() {
		//在这里我们可以对调用做一些额外的处理或者添加其他功能，这时命令模式的目的之一
		this.getPaddler().sellApple();
	}

}
