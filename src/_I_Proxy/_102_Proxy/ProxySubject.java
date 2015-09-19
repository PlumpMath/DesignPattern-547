package _I_Proxy._102_Proxy;
/*
 * Proxy(代理主题角色)：
 * 含有对真实主题角色的引用，代理角色通常在将客户端调用传递给真实主题对象之前或者之后执行某些操作，‘
 * 而不是单纯返回真实的对象。
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
		System.out.println("打折");
	}
	
	public void give(){
		System.out.println("赠送代金券");
	}
}
