package _M_Adapter._103_Adapter;
/*
 * ʲô��������ģʽ
 * ������ģʽ�ǹ���ģʽ֮һ��ͨ��Adapterģʽ���Ըı������ࣨ���ⲿ�ࣩ
 * �Ľӿ���ʽ��
 * 
 * ������   ��Ҫ����������ת������һ����ʽת������һ����ʽ��
 * ����ʼǱ��ĵ�Դ�������������õ�ת����18Vֱ����
 */
public class MainClass {
	public static void main(String[] args) {
//		//���ֱ��ʹ�ã���ʹ�õ���220V��ѹ
//		Voltage voltage = new Voltage();
//		voltage.using220V();	
		
		//����ǱʼǱ��Ļ�����Ȼ�ǲ��е�
		//���ǿ��Լ�һ��������
		
//		Adapter adapter = new Adapter();
//		adapter.using18V();
//		//����ʵ�ַ�ʽ��ͨ���̳�ʵ�ֵ�������ģʽ
		
		Voltage voltage = new Voltage();
		Adapter adapter = new Adapter(voltage);
		adapter.using18V();
	}

}
