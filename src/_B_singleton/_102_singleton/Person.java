package _B_singleton._102_singleton;

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
