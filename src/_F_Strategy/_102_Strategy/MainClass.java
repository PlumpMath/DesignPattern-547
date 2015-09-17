package _F_Strategy._102_Strategy;
/*
 * 策略模式(Strategy)是行为模式之一，它对一系列的算法加以封装，为所有算法定义一个抽象的算法接口，
 * 并通过继承该抽象算法接口对所有的算法加以封装和实现，具体的算法选择交由客户端决定(策略)。Strategy
 * 模式主要用来平滑地处理算法的切换。
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		//不适用策略模式
		Strategy strategy = new MD5Strategy();
		strategy.encrypte();
		*/
		
		Context context = new Context(new MD5Strategy());
		context.encrypt();
	}
}
