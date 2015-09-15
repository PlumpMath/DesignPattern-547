package _D_Builder._103_Builder;

public class HouseDirector {
	private HouseBuilder builder;

	public HouseDirector(HouseBuilder builder) {
		this.builder = builder;
	}

	public void makeHouse(){
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
	}
}
