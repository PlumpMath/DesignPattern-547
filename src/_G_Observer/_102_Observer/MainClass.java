package _G_Observer._102_Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		//需要注册观察者
		person.addObserver(new MyObserver());
		
		//注册完成后，运行还是不能通知到观察者
		
		//在被观察者中输出hasChanged，发现输出与是false。
		//因为hasChanged这个方法不能监听对象的改变，需要我们来告知对象的改变。
		
		
		person.setName("ZhangSan");
	}
}
