package _I_Proxy._103_Proxy;
/*
 * RealSubject(��ʵ�����ɫ):
 * �����˴����ɫ����������Ƕ���
 */
public class RealSubject implements Subject {

	@Override
	public void sellBook() {
		System.out.println("����");
	}

}
