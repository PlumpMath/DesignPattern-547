package _T_Visitor._101_Visitor;
/*
 * 公园每一部分的抽象
 */
public interface ParkElement {
	//用来接纳访问者
	public  void accept(Visitor visitor);	
}
