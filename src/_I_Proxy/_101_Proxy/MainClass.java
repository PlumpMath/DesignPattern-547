package _I_Proxy._101_Proxy;
/*
 * 代理模式(Proxy)是构造性的设计模式之一，它可以为其他对象提供一种代理(Proxy)以控制对这个对象的
 * 访问
 * 所谓代理，是指具有与代理元(被代理的对象)具有相同的接口的类，客户端必须通过代理与被代理的目标类交互，
 * 而代理一般在交互的过程中(交互前后)，进行某些特别的处理。
 */
public class MainClass {

	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		
		//直接从出版社买书
		realSubject.sellBook();
		
		//从代理商买书
		ProxySubject porxySubject = new ProxySubject();
		porxySubject.setRealSubject(realSubject);
		porxySubject.sellBook();
	}

}
