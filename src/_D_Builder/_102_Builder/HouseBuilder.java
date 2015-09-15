package _D_Builder._102_Builder;

public interface HouseBuilder {
	//修地板
	public void makeFloor();
	//修墙
	public void makeWall();
	//修屋顶
	public void makeHousetop();
	
	//建造后需要将对象返回
	public House getHouse();
}
