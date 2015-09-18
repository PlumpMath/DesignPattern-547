package _T_Visitor._101_Visitor;
/*
 * 清洁工A,负责公园A部分的卫生
 */
public class VisitorA implements Visitor {

	@Override
	public void visit(Park park) {

	}

	@Override
	public void visit(ParkA parkA) {
		System.out.println("清洁工A完成A部分的清洁工作");
	}

	@Override
	public void visit(ParkB parkB) {

	}

}
