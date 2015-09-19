package _I_Proxy._101_Proxy;
/*
 * Proxy(���������ɫ)��
 * ���ж���ʵ�����ɫ�����ã������ɫͨ���ڽ��ͻ��˵��ô��ݸ���ʵ�������֮ǰ����֮��ִ��ĳЩ��������
 * �����ǵ���������ʵ�Ķ���
 */
public class ProxySubject implements Subject{
	private RealSubject realSubject;

	public RealSubject getRealSubject() {
		return realSubject;
	}

	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public void sellBook() {
		dazhe();
		this.realSubject.sellBook();
		give();
	}
	
	public void dazhe(){
		System.out.println("����");
	}
	
	public void give(){
		System.out.println("���ʹ���ȯ");
	}
}
