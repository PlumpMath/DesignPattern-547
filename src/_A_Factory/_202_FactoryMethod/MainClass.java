package _A_Factory._202_FactoryMethod;

public class MainClass {
	public static void main(String[] args) {
		//�û��һ��Apple()������Ҫ�Ȼ��һ��AppleFactory
		FruitFactory ffApple = new AppleFactory();
		//ͨ��AppleFactory�����Appleʵ������
		Fruit apple = ffApple.getFruit();
		apple.get();
		
		FruitFactory ffBanana = new BananaFactory();
		Fruit banana = ffBanana.getFruit();
		banana.get();
		
		/*
		 * �����Ļ��������Ҫ�¼���һ����Ʒ������Pear����ֻ��Ҫ���������Ӧ��
		 * ������Ϳ����ˡ�
		 */
		PearFactory ffPear = new PearFactory();
		Fruit pear = ffPear.getFruit();
		pear.get();
		
	}
}
