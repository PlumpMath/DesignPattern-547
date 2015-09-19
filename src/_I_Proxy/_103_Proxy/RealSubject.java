package _I_Proxy._103_Proxy;
/*
 * RealSubject(真实主题角色):
 * 定义了代理角色所代表的真是对象
 */
public class RealSubject implements Subject {

	@Override
	public void sellBook() {
		System.out.println("卖书");
	}

}
