package _C_Prototype._102_Prototype;

/*
 * 实现Cloneable的对象才可以clone
 */
public class Person implements Cloneable{
	private String name;
	private int age;
	private String sex;
	
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
			return (Person) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
			
			//没有实现cloneable接口时会抛出异常
		}
		
	}
}
