package _A_Factory._201_FactoryMethod;

public class MainClass {

	/*
	 * ��Ҫ��չ��������µ��ࣨPear��ʱ����Ҫ�޸Ĺ�����
	 * �����Ͽ��ŷ��ԭ��
	 * 
	 * ��������ģʽͬ��������Ĵ�����ģʽ���ֱ���Ϊ��̬����ģʽ����������ģʽ������
	 * �Ƕ���һ��������Ʒ����Ĺ����ӿڣ���ʵ�ʴ��������Ƴٵ����൱�С����Ĺ����಻
	 * �ٸ����Ʒ�Ĵ����������������Ϊһ�����󹤳���ɫ����������幤���������ʵ��
	 * �Ľӿڣ�������һ�����󻯵ĺô���ʹ�ù�������ģʽ����ʹϵͳ�ڲ��޸ľ��幤����
	 * ɫ������������µĲ�Ʒ��
	 */
	public static void main(String[] args) {
		Fruit apple = FruitFactory.getFruit("Apple");
		Fruit banana = FruitFactory.getFruit("Banana");
		Fruit pear = FruitFactory.getFruit("Pear");
		apple.get();
		banana.get();
		pear.get();
	}
}
