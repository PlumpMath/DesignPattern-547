package _T_Visitor._101_Visitor;
/*
 * ������
 */
public interface Visitor {
	public void visit(Park park);
	public void visit(ParkA parkA);
	public void visit(ParkB parkB);
}
