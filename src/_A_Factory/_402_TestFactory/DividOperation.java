package _A_Factory._402_TestFactory;

public class DividOperation extends Operation {

	@Override
	public double getResult() {
		double result = this.getNum1() / this.getNum2();
		return result;
	}

}
