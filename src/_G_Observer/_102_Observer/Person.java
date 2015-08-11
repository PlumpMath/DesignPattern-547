package _G_Observer._102_Observer;

import java.util.Observable;
//被观察者需要继承Observable 。表示它是可以被观察的
public class Person extends Observable {
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	
	//Observable类有一个方法notifyObservers()
	//对象发生改变时要通知其他观察者，比如设置了name 需要通知其他人。
	public void setName(String name) {
		this.name = name;
		//System.out.println(this.hasChanged());
		this.notifyObservers();
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	


	
}
