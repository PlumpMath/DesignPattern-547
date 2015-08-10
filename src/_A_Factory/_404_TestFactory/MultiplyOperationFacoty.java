package _A_Factory._404_TestFactory;

public class MultiplyOperationFacoty implements OperationFactory {

	@Override
	public Operation getOperatin() {
		// TODO Auto-generated method stub
		return new MultiplyOperation();
	}

}
