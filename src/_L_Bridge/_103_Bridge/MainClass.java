package _L_Bridge._103_Bridge;
/*
 * ʲô���Ž�ģʽ
 * 
 * Bridgeģʽ�ǹ����͵����ģʽ֮һ��Bridgeģʽ���������С���ԭ��ͨ��ʹ�÷�װ���ۺ��Լ�
 * �̳е���Ϊ���ò�ͬ����е���ͬ�����Σ�������Ҫ�ص��ǰѳ���(abstraction)����Ϊʵ��(implementation)
 * ���뿪�����Ӷ����Ա��ָ����ֵĶ������Լ�Ӧ�����ǵĹ�����չ��
 */
public class MainClass {
	public static void main(String[] args) {

		
		/*
		 * ����ÿ��������ʵ�ֵĳ�����ƣ������µ������߹����Ҫ�ʼ��μ��������ࡣ
		 * ������Ҫ��һ��ʵ��
		 */
		
		/*
		 * ���ǿ��Խ�����ȫ����װ���ӿ��У������Ļ��Ϳ��Լ��ٺܶ���
		 */
//		Bus bus = new Bus();
//		bus.install2000Engine();
		
		/*
		 * �����ı׶��ǣ�������������߹��ʱ����Ҫ�޸���Ľӿں���ʵ�֣������Ͽ��ŷ��ԭ��
		 * ����������ĳЩ�����û��ĳһ�������ô�ͱ���������������Ӧ�Ŀ�ʵ��
		 */
		
		/*
		 * ���ǿ���ʹ���Ž�ģʽ��
		 * ������Ϊʵ�־��൱�ڰ�װ���������������Car
		 */
		
		Engine2000 engine2000 = new Engine2000();
		Engine2200 engine2200 = new Engine2200();
		
		Bus bus = new Bus(engine2000);
		Jeep jeep = new Jeep(engine2200);
		bus.installEngine();
		jeep.installEngine();
		
		/*
		 * �����Ļ������Ҫ�����µ����ֻ��̳�Car�������µĹ��ֻ��ʵ��Engine�ӿ�
		 */
		
	}
}