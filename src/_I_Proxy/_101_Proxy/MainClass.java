package _I_Proxy._101_Proxy;
/*
 * ����ģʽ(Proxy)�ǹ����Ե����ģʽ֮һ��������Ϊ���������ṩһ�ִ���(Proxy)�Կ��ƶ���������
 * ����
 * ��ν������ָ���������Ԫ(������Ķ���)������ͬ�Ľӿڵ��࣬�ͻ��˱���ͨ�������뱻�����Ŀ���ཻ����
 * ������һ���ڽ����Ĺ�����(����ǰ��)������ĳЩ�ر�Ĵ���
 */
public class MainClass {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		
		//ֱ�Ӵӳ���������
		realSubject.sellBook();
		
		//�Ӵ���������
		ProxySubject porxySubject = new ProxySubject();
		porxySubject.setRealSubject(realSubject);
		porxySubject.sellBook();
	}

}
