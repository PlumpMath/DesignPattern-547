package _R_TemplateMethod._102_TemplateMethod;

public class MakeBus extends MakeCar{

	//代表不同的算法实现
	@Override
	public void makeHead() {
		System.out.println("Bus组装 --> 车头");
	}

	@Override
	public void makeBody() {
		System.out.println("Bus组装 --> 车身");
	}

	@Override
	public void makeTail() {
		System.out.println("Bus组装 --> 车尾");
	}

}
