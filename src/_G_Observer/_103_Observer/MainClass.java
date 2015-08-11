package _G_Observer._103_Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		//需要注册观察者,可以注册多个对象
		person.addObserver(new MyObserver());
		//person.deleteObservers();
		System.out.println(person.countObservers());
		
		
		//注册完成后，运行还是不能通知到观察者
		
		//在被观察者中输出hasChanged，发现输出与是false。
		//因为hasChanged这个方法不能监听对象的改变，需要我们来告知对象的改变。
		//我们在set方法中通知对象改变。
		
		person.setName("ZhangSan");
		person.setSex("男");
		person.setAge(18);
		
	}
}
