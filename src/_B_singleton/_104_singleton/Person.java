package _B_singleton._104_singleton;

/*
 * ����ʽʵ�ַ�ʽ
 * 1��������̬����
 * 2���ڻ�ȡ����ľ�̬�������жϸþ�̬�����Ƿ��Ѿ���ֵ
 * 
 * 
 * �ڵ��߳����������ʽ���Ա�֤���������߳�ģʽ���ǲ����Եģ�
 * ����ʽ�ǿ��Եģ���Ϊ������������ص�ʱ�򴴽��ģ����۵��̻߳��Ƕ��̣߳���ֻ����һ��
 */
public class Person {
	private static Person person;
	
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
	public static Person getPerson(){
		if(person == null){
			person = new Person();
		}
		return person;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
