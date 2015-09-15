package _C_Prototype._104_Prototype;

import java.util.ArrayList;
import java.util.List;


/*
 * ʵ��Cloneable�Ķ���ſ���clone
 */
public class Person implements Cloneable{
	private String name;
	private int age;
	private String sex;
	private List<String> friends;
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(ArrayList<String> friends2) {
		this.friends = friends2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//����ֵ
	public Person clone(){
		try {
			Person person = (Person) super.clone();
			//�ڿ�¡��ʱ���½��������͵Ķ���
			ArrayList<String> friends = new ArrayList<>();
			for(String friend : this.getFriends()){
				friends.add(friend);
			}
			person.setFriends(friends);
			return person;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
			//û��ʵ��cloneable�ӿ�ʱ���׳��쳣
		}
		
	}
}
