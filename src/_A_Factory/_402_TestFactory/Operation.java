package _A_Factory._402_TestFactory;

public abstract class Operation {
	private double num1;
	private double num2;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(Double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(Double num2) {
		this.num2 = num2;
	}
	
	public abstract double getResult();
}
