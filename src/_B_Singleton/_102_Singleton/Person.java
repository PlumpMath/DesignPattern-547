package _B_Singleton._102_Singleton;

public class Person {
	private String name;

	/*
	 * ���캯��˽�л�
	 */
	private Person(){
		
	}
	
	/*
	 * �ṩһ��ȫ�ֵ�*��̬*������
	 * ���µľ�̬�����ǲ��ܴﵽ��ʵ��Ч����
	 */
	static Person getPerson(){
		return new Person();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
