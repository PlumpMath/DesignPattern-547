package _O_Mediator._103_Mediator;
/*
 * Mediatorģʽ������GoF�����23��������ģʽ��һ�֡�Mediatorģʽ����Ϊģʽ֮һ��
 * ��Mediatorģʽ�У���֮��Ľ�����Ϊ��ͳһ����Mediator�Ķ����У�����ͨ��Mediator
 * ����ͬ�������󽻻���Mediator�������ſ����������á�
 */

/*
 * ģ���Ҷ���
 * ��ʹ���н���ģʽ
 */
public class MainClass {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Man zhangsan = new Man("����",5,mediator);
		Man lisi = new Man("����",6,mediator);
		
		Woman xiaofang = new Woman("С��",6,mediator);
		
		zhangsan.getPartner(lisi);
			
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		
		
	}
}
