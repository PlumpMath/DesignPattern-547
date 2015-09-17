package _F_Strategy._103_Strategy;
/*
 * ���Ե��ⲿ��װ�࣬����˵���Ե������ࡣ���߲�ͬ����ִ�в�ͬ����Ϊ���������ⲿ��������
 */
public class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double cost(double num){
		return this.strategy.cost(num);
	}
}
