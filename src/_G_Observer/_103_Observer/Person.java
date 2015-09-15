package _G_Observer._103_Observer;

import java.util.Observable;
//被观察者需要继承Observable 。表示它是可以被观察的

/*
 * Observable类的实现：Observable类中维护一个容器来保存所以得观察者，
 * 当有变化时通知这些观察者--调用它们的update方法
 */
public class Person extends Observable {
	private String name;
	private String sex;
	private int age;
	
	public String getName() {
		return name;
	}
	
	/*	
	 * Observable类有一个方法notifyObservers()
	 * 对象发生改变时要通知其他观察者，比如设置了name， 需要通知其他人。
	 * */
	public void setName(String name) {
		this.name = name;
		//System.out.println(this.hasChanged());
		this.setChanged();
		this.notifyObservers();
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
		this.setChanged();
		this.notifyObservers();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		this.setChanged();
		this.notifyObservers();
	}
	


	
}
