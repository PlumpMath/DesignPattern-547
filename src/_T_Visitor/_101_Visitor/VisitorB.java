package _T_Visitor._101_Visitor;
/*
 * ��๤B,����԰B���ֵ�����
 */
public class VisitorB implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		
	}

	@Override
	public void visit(ParkB parkB) {
		System.out.println("��๤B���B���ֵ���๤��");
	}

}
