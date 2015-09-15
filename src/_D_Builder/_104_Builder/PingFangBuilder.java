package _D_Builder._104_Builder;
//平房工程队
public class PingFangBuilder implements HouseBuilder {

	/*
	 * 建造房子需要知道要建造哪个房子，所以它需要一个house的实例
	 */
	House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("平房-->地板");
	}

	@Override
	public void makeWall() {
		house.setWall("平房-->墙");
	}

	@Override
	public void makeHousetop() {
		house.setHousetop("平房-->屋顶");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
