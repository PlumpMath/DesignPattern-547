package _I_Proxy._102_Proxy;
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
