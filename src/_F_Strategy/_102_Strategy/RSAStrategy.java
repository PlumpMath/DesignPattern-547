package _F_Strategy._102_Strategy;
/*
 * ConcreteStrategy 各种策略(算法)的具体实现
 */
public class RSAStrategy implements Strategy{

	@Override
	public void encrypte() {
		System.out.println("执行RSA加密");
	}

}
