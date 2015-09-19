package _I_Proxy._103_Proxy;
/*
 * ����ģʽ(Proxy)�ǹ����Ե����ģʽ֮һ��������Ϊ���������ṩһ�ִ���(Proxy)�Կ��ƶ���������
 * ����
 * ��ν������ָ���������Ԫ(������Ķ���)������ͬ�Ľӿڵ��࣬�ͻ��˱���ͨ�������뱻�����Ŀ���ཻ����
 * ������һ���ڽ����Ĺ�����(����ǰ��)������ĳЩ�ر�Ĵ���
 */

import java.lang.reflect.Proxy;

/*
 * ��̬����
 */
public class MainClass {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		MyHandler myHandler = new MyHandler();
		
		myHandler.setRealSubject(realSubject);
		
		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), 
				realSubject.getClass().getInterfaces(), myHandler);
		
		proxySubject.sellBook();
		
	}

}
