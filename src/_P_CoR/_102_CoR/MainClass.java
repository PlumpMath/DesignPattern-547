package _P_CoR._102_CoR;
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
		/*
		//һ���ʹ�÷�������������Ҫ�ֱ𴴽�����ÿһ���֡�
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler TailH = new CarTailHandler();
		
		headH.handlerCar();
		bodyH.handlerCar();
		TailH.handlerCar();
		*/
		
		CarHandler headH = new CarHeadHandler();
		CarHandler bodyH = new CarBodyHandler();
		CarHandler tailH = new CarTailHandler();
		
		//��װ˳��Ԥ���趨�ã�˳���ǳ�ͷ--����--��β
		headH.setNextHandler(bodyH);
		bodyH.setNextHandler(tailH);
		
		//����ְ��������ͷ��ɲ���
		headH.handlerCar();
		
		System.out.println("------------------");
		
		//˳��ı䣬ϣ�� ����--��ͷ--��β
		bodyH.setNextHandler(headH);
		headH.setNextHandler(tailH);
		bodyH.handlerCar();
	}
}
