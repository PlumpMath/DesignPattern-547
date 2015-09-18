package _T_Visitor._101_Visitor;

public class Park implements ParkElement {
	private ParkA parkA;
	private ParkB parkB;
	
	
	public Park() {
		this.parkA = new ParkA();
		this.parkB = new ParkB();
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		visitor.visit(parkA);
		visitor.visit(parkB);
	}

}
