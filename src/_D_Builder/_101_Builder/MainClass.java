package _D_Builder._101_Builder;
/*
 * Builder模式也叫建造者模式或者生成器模式，是由GoF提出的23中设计模式中的一种。
 * Builder模式是一种对象创建模式之一，用来隐藏复合对象的创建过程，它把符合对象的
 * 创建过程加以抽象，通过子类继承和重载的方式，动态地创建具有复合属性的对象。
 */
public class MainClass {

	public static void main(String[] args) {
		//客户端要新建一个house
		//普通模式---客户直接建造房子
		House house = new House();
		house.setFloor("地板");
		house.setWall("墙");
		house.setHousetop("屋顶");
		
		//如果想修改这个house，那就需要在上边代码上修改。
		//并且房子的创建完全暴露给客户
		
		
	}

}
