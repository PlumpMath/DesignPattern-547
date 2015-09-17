package _F_Strategy._103_Strategy;
/*
 * ConcreteStrategy 各种策略(算法)的具体实现
 */
public class StrategyB implements Strategy{

	@Override
	public double cost(double num) {
		if (num >= 200) {
			return num - 50;
		}
		
		return num;
	}


}
