package _T_Visitor._101_Visitor;
/*
 * ��๤A,����԰A���ֵ�����
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("��๤A���A���ֵ���๤��");
	}

	@Override
	public void visit(ParkB parkB) {

	}

}
