package _V_Command._102_Command;

public class AppleCommand extends Command{
	
	public AppleCommand(Paddler paddler) {
		super(paddler);
	}

	@Override
	public void sell() {
		//���������ǿ��ԶԵ�����һЩ����Ĵ����������������ܣ���ʱ����ģʽ��Ŀ��֮һ
		this.getPaddler().sellApple();
	}

}
