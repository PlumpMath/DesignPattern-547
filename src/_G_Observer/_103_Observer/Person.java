package _G_Observer._103_Observer;

import java.util.Observable;
//���۲�����Ҫ�̳�Observable ����ʾ���ǿ��Ա��۲��

/*
 * Observable���ʵ�֣�Observable����ά��һ���������������Եù۲��ߣ�
 * ���б仯ʱ֪ͨ��Щ�۲���--�������ǵ�update����
 */
public class Person extends Observable {
	private String name;
	private String sex;
	private int age;
	
	public String getName() {
		return name;
	}
	
	/*	
	 * Observable����һ������notifyObservers()
	 * �������ı�ʱҪ֪ͨ�����۲��ߣ�����������name�� ��Ҫ֪ͨ�����ˡ�
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
