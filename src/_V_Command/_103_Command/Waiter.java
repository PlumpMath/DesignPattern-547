package _V_Command._103_Command;

public class Waiter {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void sell(){
		command.sell();
	}
	
	
}
