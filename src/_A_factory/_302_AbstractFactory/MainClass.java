package _A_factory._302_AbstractFactory;

public class MainClass {
	public static void main(String[] args) {
		FruitFactory ffNorth = new NorthFruitFactory();
		Fruit apple = ffNorth.getApple();
		apple.get();
		
		Fruit banana = ffNorth.getBanana();
		banana.get();
		
		FruitFactory ffSouth = new SouthFruitFactory();
		Fruit apple2 = ffSouth.getApple();
		apple2.get();
		
		Fruit banana2 = ffSouth.getBanana();
		banana2.get();
		
		//�����Ҫ����µĲ�Ʒ������Apple������ WenShiApple,Banana������WenShiBanana
		//��ô��ֻ��Ҫ�½���Ʒ�����Ӧ�Ĺ�����
		FruitFactory ffWenShi = new WenShiFruitFactory();
		Fruit apple3 = ffWenShi.getApple();
		apple3.get();
		Fruit banana3 = ffWenShi.getBanana();
		banana3.get();
		
		/*
		 * ���󹤳���ȱ�㣺
		 * �����Ҫ���һ���µĲ�Ʒ�ȼ���������Ҫ����һ��Pear��
		 * ����Ҫÿһ������Ĺ�����Ҫʵ�����������
		 * �Ӳ�Ʒ�ȼ����� ���󹤳�ģʽ�Ͳ�����OCP������-�պϣ�ԭ��
		 */
		
	}
}
