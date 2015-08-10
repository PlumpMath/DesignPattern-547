package _V_Command._102_Command;

public class BananaCommand extends Command{

	public BananaCommand(Paddler paddler) {
		super(paddler);
	}

	@Override
	public void sell() {
		this.getPaddler().sellBanana();
	}

}
