package _D_Builder._104_Builder;
//ƽ�����̶�
public class PingFangBuilder implements HouseBuilder {

	/*
	 * ���췿����Ҫ֪��Ҫ�����ĸ����ӣ���������Ҫһ��house��ʵ��
	 */
	House house = new House();
	
	@Override
	public void makeFloor() {
		house.setFloor("ƽ��-->�ذ�");
	}

	@Override
	public void makeWall() {
		house.setWall("ƽ��-->ǽ");
	}

	@Override
	public void makeHousetop() {
		house.setHousetop("ƽ��-->�ݶ�");
	}

	@Override
	public House getHouse() {
		return house;
	}

}
