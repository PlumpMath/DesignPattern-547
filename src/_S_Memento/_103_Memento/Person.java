package _S_Memento._103_Memento;
/*
 * Originator(ԭ����)
 * ��Ҫ������״̬�Ա�ָ����Ǹ�����
 */
public class Person {
	//����
	private String name;
	//�Ա�
	private String sex;
	//���� 
	private int age;
	
	public Person(){
		
	}
	
	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public void display(){
		System.out.println("name:" + this.name + ";sex:" + this.sex + ";age:" + this.age);
	}
	
	//����һ������
	public Memento createMemento(){
		return new Memento(this.name,this.sex,this.age);
	}
	
	//�ָ�һ������
	public void setMemento(Memento memento){
		this.name = memento.getName();
		this.sex = memento.getSex();
		this.age = memento.getAge();
	}
	
}