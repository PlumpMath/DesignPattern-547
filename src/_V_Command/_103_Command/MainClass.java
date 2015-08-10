package _V_Command._103_Command;

/*
 * ������MainClass�����Paddler���еķ���������ʹ������ģʽ
 */
public class MainClass {
	public static void main(String[] args) {
		Paddler paddler = new Paddler();
		
//		paddler.sellApple();
//		paddler.sellBanana();
		
//		Command appleCommand = new AppleCommand(paddler);
//		appleCommand.sell();
//		
//		Command bananaCommand = new BananaCommand(paddler);
//		bananaCommand.sell();
//		//����ĵ����ƺ�Ҳ���Ǻܺ���--ֱ��ʹ��������������ǵĲ�����
//		// ����˵�̷�����һ������Ա���ͻ��������������Ա���ɷ���Ա��ͳһ������Щ�������Щ����Ͳ�ͬ��ִ����
		
		//ʹ��Waiter
		Waiter waiter = new Waiter();
		Command appleCommand = new AppleCommand(paddler);
		Command bananaCommand = new BananaCommand(paddler);
		waiter.setCommand(appleCommand);
		waiter.sell();
		
		waiter.setCommand(bananaCommand);
		waiter.sell();
	
	}
	/*
	 * ����ģʽ��Ӧ�ó�����
	 * ���������ĳ�������У�һ�����������һ������һ������µĵ��ù����ǣ�����Ŀ�����ʵ����
	 * ���õ��ò���������Ŀ�����ķ�����
	 * ������Щ������б�Ҫʹ��һ��ר�ŵ�������ֵ��ù��̼��Է�װ�����ǰ�����ר�ŵ������Command�ࡣ
	 * --�������ù��̱ȽϷ��ӣ����ߴ��ڶദ���ֵ��ã���ʱ��ʹ��Command��Ըõ��ü��Է�װ�����ڹ��ܵ�������
	 * --����ǰ����Ҫ�Ե��ò�������ĳЩ����
	 * --����ǰ����Ҫ����ĳЩ���⴦��������־�����棬��¼��ʷ�����ȡ�
	 * 
	 */
}
