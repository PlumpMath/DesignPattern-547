package _B_Singleton._101_Singleton;

public class MainClass {
	
	/*
	 * һ���ʹ�÷����У�һ������Դ����������ÿ�������˽�з����ǲ�ͬ�ġ�
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.setName("ZhangSan");
		p2.setName("LiSi");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		
	}

}
