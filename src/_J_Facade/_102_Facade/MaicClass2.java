package _J_Facade._102_Facade;
/*
 * 外观模式(Facade)，是由GoF提出的23种设计模式中的一种，Facade模式为一组具有类似功能的类群，
 * 比如类库，子系统等等，提供一个一致的简单的界面。这个一致的简单的界面被称作facade
 */
public class MaicClass2 {
	public static void main(String[] args) {
		/*
		 * 常规调用
		 */
		//实现A子系统功能
		SystemA systemA = new SystemA();
		systemA.doSomething();
		
		SystemB systemB = new SystemB();
		systemB.doSomething();
		
	}
}
