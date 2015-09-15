package _M_Adapter._103_Adapter;

/*
 * 委让方式实现适配器模式
 * 
 * 让适配器持有一个需要适配的对象的引用
 */
public class Adapter extends Voltage{
	private Voltage voltage;
	
	public Adapter(Voltage voltage){
		this.voltage = voltage;
	}
	
	//可以在这里对调用做一些转换
	public void using18V(){
		System.out.println("使用适配器");
		this.voltage.using220V();
	}
}
