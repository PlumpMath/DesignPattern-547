package _U_State._103_State;
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
		
		//������Ȼʵ���˽��߼��ж�ת�Ƶ���״̬�����ˣ�������һ�����⣬��Ϊ״̬�ж��ǵ����ƶ���
		//�����state����Ϊ��ǰstate��ǰ�ߵ�ĳ��stateֵʱ����������ȷ����Ӧ��Ӧ�Ķ���
		person.setHour(7);
		person.doSomething();
	}
}

/*
 * ״̬ģʽ��Ӧ�ó�����
 * ״̬ģʽ��Ҫ������ǵ�����һ������״̬ת���������ʽ���ڸ��ӵ��������״̬���ж��߼�ת�Ƶ�����
 * ��ͬ״̬��һϵ���൱�У����԰Ѹ��ӵ��ж��߼��򻯡�
 */
