package _E_Decorator._103_Decorator;
/*
 * װ�����������������ӹ��������Ը�������µĹ��ܡ�
 * ��������Ҫ����һ����װ�ζ��������
 */
public abstract class CarDecorator {
	private Car car;
	
	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarDecorator(Car car){
		this.car = car;
	} 
	
	public abstract void show();
}
