package _R_TemplateMethod._101_TemplateMethod;

public class MakeBus extends MakeCar{

	@Override
	public void makeHead() {
		System.out.println("Bus��װ --> ��ͷ");
	}

	@Override
	public void makeBody() {
		System.out.println("Bus��װ --> ����");
	}

	@Override
	public void makeTail() {
		System.out.println("Bus��װ --> ��β");
	}

}
