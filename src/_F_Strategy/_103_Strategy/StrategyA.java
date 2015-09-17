package _F_Strategy._103_Strategy;
/*
 * ConcreteStrategy 各种策略(算法)的具体实现
 */
public class StrategyA implements Strategy{

	@Override
	public double cost(double num) {
		return  0.8 * num;
	}

}

