package _J_Facade._104_Facade;
/*
 * 外观模式(Facade)，是由GoF提出的23种设计模式中的一种，Facade模式为一组具有类似功能的类群，
 * 比如类库，子系统等等，提供一个一致的简单的界面。这个一致的简单的界面被称作facade
 */
public class MaicClass {
	public static void main(String[] args) {
		JiJin_Facade jijin = new JiJin_Facade();
		jijin.buy();
	}
}
