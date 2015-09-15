package _C_Prototype._104_Prototype;

import java.util.ArrayList;
import java.util.List;


/*
 * 实现Cloneable的对象才可以clone
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
	
	//返回值
	public Person clone(){
		try {
			Person person = (Person) super.clone();
			//在克隆的时候新建引用类型的对象
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
			
			//没有实现cloneable接口时会抛出异常
		}
		
	}
}
