package _M_Adapter._101_Adapter;
/*
 * 什么是适配器模式
 * 适配器模式是构造模式之一，通过Adapter模式可以改变已有类（或外部类）
 * 的接口形式。
 * 
 * 适配器   主要作用是用来转换，将一种形式转换成另一种形式。
 * 比如笔记本的电源适配器，将家用电转换成18V直流电
 */
public class MainClass {
	public static void main(String[] args) {
		//如果直接使用，则使用的是220V电压
		Voltage voltage = new Voltage();
		voltage.using220V();		
	}

}
