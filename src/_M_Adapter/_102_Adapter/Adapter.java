package _M_Adapter._102_Adapter;

public class Adapter extends Voltage{
	//可以在这里对调用做一些转换
	public void using18V(){
		System.out.println("使用适配器");
		this.using220V();
	}
}
