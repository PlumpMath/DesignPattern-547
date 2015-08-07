package _A_factory._403_TestFactory;

public class OperationFactory {
	public static Operation getOperatin(String operation){
		if("+".equals(operation)){
			return new AddOperation();
		}else if("-".equals(operation)){
			return new SubtractOperation();
		}else if("*".equals(operation)){
			return new MultiplyOperation();
		}else if("/".equals(operation)){
			return new DividOperation();
		}else{
			System.out.println("·Ç·¨²Ù×÷·û");
			return null;
		}
	}
}
