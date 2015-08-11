package _G_Observer._101_Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		//设置后，运行并没有通知到观察者。
		person.setName("ZhangSan");
	}
}
