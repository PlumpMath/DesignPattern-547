package _A_factory._404_TestFactory;

public class AddOperationFactory implements OperationFactory {

	@Override
	public Operation getOperatin() {
		// TODO Auto-generated method stub
		return new AddOperation();
	}

}
