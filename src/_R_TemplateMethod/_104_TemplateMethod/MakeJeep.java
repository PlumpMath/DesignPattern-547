package _R_TemplateMethod._104_TemplateMethod;

public class MakeJeep extends MakeCar{

	@Override
	public void makeHead() {
		System.out.println("Jeep��װ --> ��ͷ");
	}

	@Override
	public void makeBody() {
		System.out.println("Jeep��װ --> ����");
	}

	@Override
	public void makeTail() {
		System.out.println("Jeep��װ --> ��β");
	}

	@Override
	public void make() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}

}
