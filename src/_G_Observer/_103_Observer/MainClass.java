package _G_Observer._103_Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		//��Ҫע��۲���,����ע��������
		person.addObserver(new MyObserver());
		//person.deleteObservers();
		System.out.println(person.countObservers());
		
		
		//ע����ɺ����л��ǲ���֪ͨ���۲���
		
		//�ڱ��۲��������hasChanged�������������false��
		//��ΪhasChanged����������ܼ�������ĸı䣬��Ҫ��������֪����ĸı䡣
		//������set������֪ͨ����ı䡣
		
		person.setName("ZhangSan");
		person.setSex("��");
		person.setAge(18);
		
	}
}
