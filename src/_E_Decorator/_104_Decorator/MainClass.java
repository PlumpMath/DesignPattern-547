package _E_Decorator._104_Decorator;
/*
 * װ��(Decorator)ģʽ�ֽ�����װģʽ��ͨ��һ�ֶԿͻ���͸���ķ�ʽ����չ����Ĺ��ܣ�
 * �Ǽ̳й�ϵ��һ�����������
 */
public class MainClass {
	public static void main(String[] args) {
//		Car runCar = new RunCar();
//		//runCar.show();
//		
//		//CarDecorator carDecorator = new FlyCarDecorator(runCar);
//		CarDecorator carDecorator = new SwimCarDecorator(runCar);
//		carDecorator.show();
		
		/*
		 * ���Ҫʵ�ּ��ܷ������εĳ������ʵ���أ�
		 * Ҫ�½�һ��FlySwimCarDecorator��
		 * �ܷ�ͨ�����Ѿ���װ�ι��Ķ�������������װ���أ������ڿ��ԷɵĶ��������ӿ����εĹ����أ�
		 * ������Ҫ��CarDecoratorʵ��Car�ӿڣ���CarDecoratorҲ����Car�ӿڹ���,
		 * �����Ļ�����¹��ܺ�������Car
		 */
		
		Car car = new RunCar();
		
		Car swimCar = new SwimCarDecorator(car);
		Car flySwimCar = new FlyCarDecorator(swimCar);
		flySwimCar.show();
	
	}
}

/*
 * װ��ģʽ�Ľ�ɫ��ְ��
 * ���������ɫ��һ������ӿڣ��Ǳ�װ�����װ����ĸ��ӿڡ�
 * ���������ɫ��Ϊ���������ʵ����
 * ����װ�ν�ɫ������һ����������ã�����������������һ�µĽӿڣ�
 * ����װ�ν�ɫ��Ϊ����װ�ν�ɫ��ʵ���࣬��������װ��
 */
