package _F_Strategy._103_Strategy;
/*
 * ����ģʽ(Strategy)����Ϊģʽ֮һ������һϵ�е��㷨���Է�װ��Ϊ�����㷨����һ��������㷨�ӿڣ�
 * ��ͨ���̳иó����㷨�ӿڶ����е��㷨���Է�װ��ʵ�֣�������㷨ѡ���ɿͻ��˾���(����)��Strategy
 * ģʽ��Ҫ����ƽ���ش����㷨���л���
 */
public class MainClass {
	public static void main(String[] args) {
		double num = 200;
		
		Context context = new Context(new StrategyA());
		double newNum = context.cost(num);
		
		System.out.println("ʵ�ʸ��" + newNum + "Ԫ");
		
		context = new Context(new StrategyB());
		newNum = context.cost(num);
		
		System.out.println("ʵ�ʸ��" + newNum + "Ԫ");
		
	}
}
