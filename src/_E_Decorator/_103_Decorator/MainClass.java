package _E_Decorator._103_Decorator;
/*
 * װ��(Decorator)ģʽ�ֽ�����װģʽ��ͨ��һ�ֶԿͻ���͸���ķ�ʽ����չ����Ĺ��ܣ�
 * �Ǽ̳й�ϵ��һ�����������
 */
public class MainClass {
	public static void main(String[] args) {
		Car runCar = new RunCar();
		//runCar.show();
		
		//CarDecorator carDecorator = new FlyCarDecorator(runCar);
		CarDecorator carDecorator = new SwimCarDecorator(runCar);
		carDecorator.show();
	}
}
