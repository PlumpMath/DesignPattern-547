package _R_TemplateMethod._102_TemplateMethod;

public class MakeBus extends MakeCar{

	//����ͬ���㷨ʵ��
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
