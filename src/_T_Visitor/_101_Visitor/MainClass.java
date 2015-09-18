package _T_Visitor._101_Visitor;
/*
 * ������ģʽ(Visitor)����Ϊģʽ֮һ���������������ݺ���Ϊ��ʹ��Visitorģʽ�����Բ��޸��������
 * ����£������µĲ�����
 * 
 * ������ģʽ��Ӧ��ʾ����
 * ������һ����԰����һ�������ͬ����ɲ��֣��ù�԰���ڶ�������ߣ���๤A�����ɨ��԰��A���֣���๤B�����ɨ��԰
 * B���֣���԰�Ĺ����߸�������������Ƿ���ɣ��ϼ��쵼�����Ӳ칫԰�ȵȣ�Ҳ����˵������ͬһ����԰����ͬ�ķ�����
 * �в�ͬ����Ϊ���������ҷ����ߵ�����Ҳ���ܸ���ʱ������ƶ��仯(��Ϊ����չ��)
 * ���������ƵĿ���ԭ��(���޸Ĺرգ�����չ����)���������ʵ����������
 */
public class MainClass {

	public static void main(String[] args) {
		Park park = new Park();
		VisitorA visitorA = new VisitorA();
		park.accept(visitorA);
		
		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);
		
		VisitorManager manager = new VisitorManager();
		park.accept(manager);
	}

}
