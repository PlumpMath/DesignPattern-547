package _M_Adapter._103_Adapter;

/*
 * ί�÷�ʽʵ��������ģʽ
 * 
 * ������������һ����Ҫ����Ķ��������
 */
public class Adapter extends Voltage{
	private Voltage voltage;
	
	public Adapter(Voltage voltage){
		this.voltage = voltage;
	}
	
	//����������Ե�����һЩת��
	public void using18V(){
		System.out.println("ʹ��������");
		this.voltage.using220V();
	}
}
