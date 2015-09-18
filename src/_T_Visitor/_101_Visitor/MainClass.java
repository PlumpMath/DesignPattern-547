package _T_Visitor._101_Visitor;
/*
 * 访问者模式(Visitor)是行为模式之一，它分离对象的数据和行为，使用Visitor模式，可以不修改已有类的
 * 情况下，增加新的操作。
 * 
 * 访问者模式的应用示例：
 * 比如有一个公园，有一到多个不同的组成部分，该公园存在多个访问者：清洁工A负责打扫公园的A部分，清洁工B负责打扫公园
 * B部分，公园的管理者负责检查各项事务是否完成，上级领导可以视察公园等等，也就是说，对于同一个公园，不同的访问者
 * 有不同的行为操作，而且访问者的种类也可能根据时间的推移而变化(行为的扩展性)
 * 根据软件设计的开闭原则(对修改关闭，对扩展开放)，我们如何实现这种需求？
 */
public class MainClass {

	public static void main(String[] args) {
		Park park = new Park();
		VisitorA visitorA = new VisitorA();
		park.accept(visitorA);
		
		VisitorB visitorB = new VisitorB();
		park.accept(visitorB);
		
		VisitorManager manager = new VisitorManager();
		park.accept(manager);
	}

}
