package _S_Memento._101_Memento;
/*
 * ����¼(Memento)ģʽ������Ϊģʽ֮һ�����������Ǳ��������ڲ�״̬��������Ҫ��ʱ��(undo/rollback)
 * �ظ�������ǰ��״̬��
 */
public class MainClass {

	public static void main(String[] args) {
		Person person = new Person("lisi","��",30);
		
		//�����ڲ�״̬
		Person backup = new Person();
		backup.setName(person.getName());
		backup.setSex(person.getSex());
		backup.setAge(person.getAge());
		
		person.display();
		
		//�޸�
		person.setAge(20);
		person.display();
		
		//�ع�  ��ԭ
		backup.setName(backup.getName());
		backup.setSex(backup.getSex());
		backup.setAge(backup.getAge());
		person.display();
	
		//�����ñ���¼ģʽʱ��״̬�ı���ͻָ���ȫ�����ͻ��ˣ����ǲ�������
	}

}