package _P_CoR._101_CoR;
/*Chain of Responsibility --- CoR��ģʽ����Ϊģʽ֮һ����ģʽ����һϵ�зֱ�
 * ������ͬ��ְ�����Ķ�������ͬ���һ��������Щ��Ķ���֮��������һ���������������Ա�����
 * ְ����ģʽ��
 */

/*
 * ְ����ģʽ��Ӧ�ó�����
 * ��1������ͻ�ClientҪ���һ����������������a,b,c,d�ĸ����֡�
 * ���ȿͻ�Client�����񽻸�A��A���a����֮�󣬰����񽻸�B,B���b����,...,
 * ֪��D���d���֡�
 * ��2�������������ֵ�ĳ�����������������Լ��ܴ���Ĳ��֣����ܴ���Ĳ��ֽ���ʡ������
 * ʡ����������Լ�ְ��Χ�ڵĲ��֣����ܴ���Ĳ��ֽ�����������,�������������ɸ������
 * ��3��������ڵ���Ϣ����
 * ��4��SERVLET�����Ĺ�����(Filter)���ʵ�֡�
 */
public class MainClass {
	public static void main(String[] args) {
		//һ���ʹ�÷�������������Ҫ�ֱ𴴽�����ÿһ���֡�
		CarHandler headH = new CarHeadHandler();
		CarHandler headB = new CarBodyHandler();
		CarHandler headT = new CarTailHandler();
		
		headH.handlerCar();
		headB.handlerCar();
		headT.handlerCar();
		
	}
}
