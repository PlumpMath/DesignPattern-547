package _A_Factory._403_TestFactory;

public class MultiplyOperation extends Operation {

	@Override
	public double getResult() {
		double result = this.getNum1() * this.getNum2();
		return result;
	}

}
