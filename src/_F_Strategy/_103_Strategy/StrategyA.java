package _F_Strategy._103_Strategy;
/*
 * ConcreteStrategy ���ֲ���(�㷨)�ľ���ʵ��
 */
public class StrategyA implements Strategy{

	@Override
	public double cost(double num) {
		return  0.8 * num;
	}

}

