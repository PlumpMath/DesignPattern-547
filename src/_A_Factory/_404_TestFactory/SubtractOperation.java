package _A_Factory._404_TestFactory;

public class SubtractOperation extends Operation {

	@Override
	public double getResult() {
		double result = this.getNum1() - this.getNum2();
		return result;
	}

}
