package _A_factory._403_TestFactory;

public class SubtractOperation extends Operation {

	@Override
	public double getResult() {
		double result = this.getNum1() - this.getNum2();
		return result;
	}

}
