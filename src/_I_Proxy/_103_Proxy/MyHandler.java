package _I_Proxy._103_Proxy;
/*
 * 只是用来处理，这里根本没有方法的事项。注意和ProxySubject的区别
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

	private RealSubject realSubject;
	
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		Object result;
		dazhe();
		result = arg1.invoke(realSubject,arg2);
		give();
		return result;
	}

	public void dazhe(){
		System.out.println("打折");
	}
	
	public void give(){
		System.out.println("赠送代金券");
	}
}
