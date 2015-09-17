package _F_Strategy._102_Strategy;
/*
 * ���Ե��ⲿ��װ�࣬����˵���Ե������ࡣ���߲�ͬ����ִ�в�ͬ����Ϊ���������ⲿ��������
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void encrypt(){
		this.strategy.encrypte();
	}
}
