package _U_State._102_State;
/*
 * StateģʽҲ��״̬ģʽ������Ϊ���ģʽ��һ�֡�Stateģʽ����ͨ���ı������ڲ�״̬���ı�������Ϊ��
 * ���������ֵþͺ����޸�������״̬һ��
 */
public class MainClass {
	public static void main(String [] args){
		Person person = new Person();
		//�������ǾͿ���ͨ���ı��ڲ�״̬���ı�����Ϊ
	
		person.setHour(7);
		person.doSomething();
		
		person.setHour(12);
		person.doSomething();
		
		person.setHour(18);
		person.doSomething();
		
		person.setHour(8);
		person.doSomething();
	}
}

/*
 * ״̬ģʽ��Ӧ�ó�����
 * ״̬ģʽ��Ҫ������ǵ�����һ������״̬ת���������ʽ���ڸ��ӵ��������״̬���ж��߼�ת�Ƶ�����
 * ��ͬ״̬��һϵ���൱�У����԰Ѹ��ӵ��ж��߼��򻯡�
 */
