package _D_Builder._104_Builder;
/*
 * Builder模式也叫建造者模式或者生成器模式，是由GoF提出的23中设计模式中的一种。
 * Builder模式是一种对象创建模式之一，用来隐藏复合对象的创建过程，它把符合对象的
 * 创建过程加以抽象，通过子类继承和重载的方式，动态地创建具有复合属性的对象。
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		//客户端要新建一个house
		//普通模式---客户直接建造房子
		House house = new House();
		house.setFloor("地板");
		house.setWall("墙");
		house.setHousetop("屋顶");
		
		//如果想修改这个house，那就需要在上边代码上修改。
		//并且房子的创建完全暴露给客户
		*/
		
		/*
		//由工程队来修房子
		HouseBuilder builder = new PingFangBuilder();
		//仍然需要调用工程队的方法，这时我们可以引入另外一个角色（Director）来完成建造，
		//该角色需要持有一个Builder的引用，使用该Builder来完成建造的工作。
		builder.makeFloor();
		builder.makeWall();
		builder.makeHousetop();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		*/
		
		/*
		HouseBuilder builder = new PingFangBuilder();
		//由设计者来建造
		HouseDirector director = new HouseDirector(builder);
		director.makeHouse();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		*/
		
		
		//如果需要建造其他类型的房子
		HouseBuilder builder = new GongYuBuilder();//这里还可以通过反射，动态的选择“工程队”
		HouseDirector director = new HouseDirector(builder);
		director.makeHouse();
		House house = builder.getHouse();
		System.out.println(house.getFloor());
		System.out.println(house.getWall());
		System.out.println(house.getHousetop());
		
	}

}
