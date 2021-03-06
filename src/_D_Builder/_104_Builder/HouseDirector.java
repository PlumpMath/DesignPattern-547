package _D_Builder._104_Builder;
/*
 * Director角色中builder可以通过多种方式传入
 * 1、通过构造函数传入
 * 2、通过makeHouse参数传入（最好）
 * 4、通过set方法传入
 */
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
