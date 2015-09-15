package _U_State._102_State;
/*
 * State模式也叫状态模式，是行为设计模式的一种。State模式允许通过改变对象的内部状态而改变对象的行为，
 * 这个对象表现得就好像修改了它的状态一样
 */
public class MainClass {
	public static void main(String [] args){
		Person person = new Person();
		//这样我们就可以通过改变内部状态而改变其行为
	
		person.setHour(7);
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
		person.setHour(18);
		person.doSomething();
		
		person.setHour(8);
		person.doSomething();
	}
}

/*
 * 状态模式的应用场景：
 * 状态模式主要解决的是当控制一个对象状态转换条件表达式过于复杂的情况，把状态的判断逻辑转移到表现
 * 不同状态的一系列类当中，可以把复杂的判断逻辑简化。
 */
