package _F_Strategy._103_Strategy;
/*
 * ConcreteStrategy ���ֲ���(�㷨)�ľ���ʵ��
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
