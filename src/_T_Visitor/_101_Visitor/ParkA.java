package _T_Visitor._101_Visitor;

public class ParkA implements ParkElement{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
