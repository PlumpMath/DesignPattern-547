package _I_Proxy._102_Proxy;
/*
 * Proxy(���������ɫ)��
 * ���ж���ʵ�����ɫ�����ã������ɫͨ���ڽ��ͻ��˵��ô��ݸ���ʵ�������֮ǰ����֮��ִ��ĳЩ��������
 * �����ǵ���������ʵ�Ķ���
 */
public class ProxySubject implements Subject{
	private RealSubject realSubject;

	@Override
	public void sellBook() {
		dazhe();
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.sellBook();
		give();
	}
	
	public void dazhe(){
		System.out.println("����");
	}
	
	public void give(){
		System.out.println("���ʹ���ȯ");
	}
}
