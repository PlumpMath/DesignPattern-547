package _U_State._103_State;

public class Person {
	private int hour;
	
	private State state;

	public Person(){
		state = new MState();
	}
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	/*
	 * 要将状态判断逻辑转移到相应的状态类中，这里"吃早餐、吃午餐、未定义"都是一种状态
	 * 所以需要创建相应的状态类
	 */
	/*
	 public void doSomething(){
		if (hour == 7) {
			System.out.println("吃早餐");
		}else if (hour == 12) {
			System.out.println("吃午餐");
		}else if (hour == 18) {
			System.out.println("吃晚餐");
		}else{
			System.out.println("未定义");
		}
	}
	*/
	
	public void doSomething(){
		//判断逻辑还是放在了类里边
		state.stateChange(this);
	
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
