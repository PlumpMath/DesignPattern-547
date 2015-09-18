package _R_TemplateMethod._104_TemplateMethod;

public class MakeJeep extends MakeCar{

	@Override
	public void makeHead() {
		System.out.println("Jeep组装 --> 车头");
	}

	@Override
	public void makeBody() {
		System.out.println("Jeep组装 --> 车身");
	}

	@Override
	public void makeTail() {
		System.out.println("Jeep组装 --> 车尾");
	}

	@Override
	public void make() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}

}
