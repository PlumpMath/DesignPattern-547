package _F_Strategy._103_Strategy;
/*
 * 策略的外部封装类，或者说策略的容器类。更具不同策略执行不同的行为，策略由外部环境决定
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
