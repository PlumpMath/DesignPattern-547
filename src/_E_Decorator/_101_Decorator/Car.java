package _E_Decorator._101_Decorator;

public class Car {
	//��
	public void run(){
		System.out.println("������");
	}
	
	//���ſƼ��ķ�չ����Щ�����ܿ��Էɣ�������
	public void fly(){
		System.out.println("���Է�");
	}
	
	public void swim(){
		System.out.println("������");
	}
	
	/*
	 * ����д��Ȼ�ǲ�̫���ʵģ���Ϊ������Car������һ���ԣ������Ƕ�Car�ĳ���
	 * 
	 * ����ν���أ�
	 * ����ͨ���̳�
	 */
	
	
	
	
	public void show(){
		System.out.println("ӵ�еĹ��ܣ�");
		this.run();
		this.fly();
		this.swim();
	}
	
}
