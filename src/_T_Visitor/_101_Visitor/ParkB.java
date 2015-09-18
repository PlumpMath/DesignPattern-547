package _T_Visitor._101_Visitor;

public class ParkB implements ParkElement{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
