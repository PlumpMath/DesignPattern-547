package _B_singleton._103_singleton;

/*
 *  ����ģʽ����ʽʵ�ַ�ʽ
 *  1��˽�л����캯��
 *  2����������ֵ����̬����
 *  3����̬�������þ�̬��������
 *  
 */
public class Person {
	
	//��̬���������һ�μ��ص�ʱ��ִ�е�
	public static final Person person = new Person();
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
		return person;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
