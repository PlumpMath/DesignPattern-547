package _F_Strategy._102_Strategy;
/*
 * ����ģʽ(Strategy)����Ϊģʽ֮һ������һϵ�е��㷨���Է�װ��Ϊ�����㷨����һ��������㷨�ӿڣ�
 * ��ͨ���̳иó����㷨�ӿڶ����е��㷨���Է�װ��ʵ�֣�������㷨ѡ���ɿͻ��˾���(����)��Strategy
 * ģʽ��Ҫ����ƽ���ش����㷨���л���
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		//�����ò���ģʽ
		Strategy strategy = new MD5Strategy();
		strategy.encrypte();
		*/
		
		Context context = new Context(new MD5Strategy());
		context.encrypt();
	}
}
