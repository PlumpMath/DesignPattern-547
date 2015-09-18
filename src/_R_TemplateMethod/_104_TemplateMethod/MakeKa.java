package _R_TemplateMethod._104_TemplateMethod;

public class MakeKa extends MakeCar{

	@Override
	public void makeHead() {
		System.out.println("卡车组装 --> 车头");
	}

	@Override
	public void makeBody() {
		System.out.println("卡车组装 --> 车身");
	}

	@Override
	public void makeTail() {
		System.out.println("卡车组装 --> 车尾");
	}

	@Override
	public void make() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}

}
