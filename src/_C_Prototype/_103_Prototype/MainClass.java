package _C_Prototype._103_Prototype;

import java.util.ArrayList;

/*
 * ԭ��ģʽ��
 * Prototypeģʽ��һ�ֶ��󴴽���ģʽ������ȡ����ԭ�Ͷ���ķ��������������ʵ����
 * ʹ��Prototypeģʽ������ʵ����������ԭ��һ�������ݡ�
 */
public class MainClass {
	public static void main(String[] args) {
//		Person person1 = new Person();
//		person1.setName("ZhangSan");
//		person1.setAge(30);
//		person1.setSex("��");
//		
//		Person person2 = new Person();
//		person2.setName("LiSi");
//		person2.setAge(30);
//		person2.setSex("��");
//		
//		/*
//		 * ������Ҫ��������������ǵ�����ֻ���ٲ��ֵ����Բ�ͬ��
//		 * �����Ƿ����ͨ�����ƶ���ķ�ʽ��ʵ����
//		 * ����ͨ��ԭ�Ͷ�����ʵ��
//		 */
		
//		Person person1 = new Person();
//		person1.setName("ZhangSan");
//		person1.setAge(30);
//		person1.setSex("��");
		
		/*
		 * ���ø�ֵ��clone����ȫ��ͬ�ġ�
		 * ���ø�ֵ����������ִ��ͬһ������
		 * ��clone��ָ��ͬ�Ķ���
		 */
		//Person person2 = person1
//		Person person2 = person1.clone();
//		
//		person1.setName("����");
//		System.out.println(person2.getName());
		
		/*
		 * ���ݶ����¡��Ȳ�εĲ�ͬ����ǳ�ȿ�¡����ȿ�¡��
		 * ǳ�ȿ�¡ֻ��¡��ֵ�ͱ������������ñ��������¡����Ȼ������ͬ�����á�
		 * ��ȿ�¡�Ὣ�����е��������ͱ���Ҳ��¡
		 */
		
		Person person1 = new Person();
		person1.setName("ZhangSan");
		person1.setAge(30);
		person1.setSex("��");
		ArrayList<String> friends = new ArrayList<>();
		friends.add("James");
		friends.add("Kobe");
		person1.setFriends(friends);
		
		Person person2 = person1.clone();
		
		friends.add("Mac");
		person1.setFriends(friends);
		//�޸�һ�������е��������ͱ�������ı������¡�õ��Ķ���
		//˵����Щ����ָ��ͬһ������
		//�����ʵ����ȿ�¡�أ�
		
		System.out.println("Person1��Friends:" + person1.getFriends());
		System.out.println("Person2��Friends:" + person2.getFriends());
		
		
	}
}
