package _O_Mediator._101_Mediator;
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
		Man zhangsan = new Man("����",5);
		Man lisi = new Man("����",6);
		
		Woman xiaofang = new Woman("С��",6);
		
		zhangsan.getPartner(xiaofang);
		lisi.getPartner(xiaofang);
		
		zhangsan.getPartner(lisi);
	}
}
