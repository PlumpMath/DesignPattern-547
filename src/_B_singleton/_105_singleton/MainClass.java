package _B_singleton._105_singleton;

public class MainClass {
	
	/*
	 * һ���ʹ�÷����У�һ������Դ����������ÿ�������˽�з����ǲ�ͬ�ġ�
	 * ����α�ֻ֤��һ�������أ�
	 * new���������õ������Ĭ�Ϲ��캯��,�ѹ��캯��˽�л�����ô�Ͳ�����new�����������
	 */
	public static void main(String[] args) {
		Person p1 = Person.getPerson();
		Person p2 = Person.getPerson();
		
		p1.setName("ZhangSan");
		p2.setName("LiSi");
		//ֻ���LiSi˵��p1��p2ָ��ͬһ������
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
