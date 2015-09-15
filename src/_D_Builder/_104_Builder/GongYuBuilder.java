package _D_Builder._104_Builder;

public class GongYuBuilder implements HouseBuilder{
	
	House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("��Ԣ --> �ذ�");
	}

	@Override
	public void makeWall() {
		house.setWall("��Ԣ --> ǽ");
	}

	@Override
	public void makeHousetop() {
		house.setHousetop("��Ԣ --> ����");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
