package _R_TemplateMethod._103_TemplateMethod;
/*
 * ģ�巽��ģʽ(Template Method)������Ϊģʽ֮һ�����Ѿ����ض������㷨�е�ĳЩ
 * ��Ҫ�Ĵ���ί�ø����󷽷���ͨ������̳жԳ��󷽷��Ĳ�ͬʵ�ָı������㷨����Ϊ
 * 
 * Ӧ�ó�����
 * -����ͬ��Ĳ���������������
 * -���в�ͬ�Ĳ���ϸ��
 * -���ڶ������ͬ�����������Ӧ�ó�������ĳЩ����Ĳ���ϸ��ȴ������ͬ
 */
public class MainClass {
	public static void main(String[] args) {
		MakeBus bus = new MakeBus();
//		bus.makeHead();
//		bus.makeBody();
//		bus.makeTail();
		bus.make();
		//�����Ҫ��չ
		
		System.out.println("-----------");
		MakeJeep jeep = new MakeJeep();
//		jeep.makeHead();
//		jeep.makeBody();
//		jeep.makeTail();
		jeep.make();
		
		
	}
}
