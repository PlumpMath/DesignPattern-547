package _T_Visitor._101_Visitor;

public class VisitorManager implements Visitor {

	@Override
	public void visit(Park park) {
		System.out.println("����Ա������԰�������");
	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("����Ա������԰A�����������");
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("����Ա������԰B�����������");
	}

}
