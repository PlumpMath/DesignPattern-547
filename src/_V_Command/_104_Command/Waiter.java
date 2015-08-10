package _V_Command._104_Command;

import java.util.ArrayList;

public class Waiter {
	
	ArrayList<Command> commandList = new ArrayList<Command>();


	public void setCommand(Command command) {
		commandList.add(command);
	}

	public void removeCommand(Command command){
		commandList.remove(command);
	}
	
	public void sell(){
		for(Command command:commandList){
			command.sell();
		}
	}
	
	
}
