package _G_Observer._102_Observer;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		//��Ҫע��۲���
		person.addObserver(new MyObserver());
		
		//ע����ɺ����л��ǲ���֪ͨ���۲���
		
		//�ڱ��۲��������hasChanged�������������false��
		//��ΪhasChanged����������ܼ�������ĸı䣬��Ҫ��������֪����ĸı䡣
		
		
		person.setName("ZhangSan");
	}
}
