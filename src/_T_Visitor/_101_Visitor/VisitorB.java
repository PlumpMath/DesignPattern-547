package _T_Visitor._101_Visitor;
/*
 * 清洁工B,负责公园B部分的卫生
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
		System.out.println("清洁工B完成B部分的清洁工作");
	}

}
