package _A_Factory._401_TestFactory;

import java.util.Scanner;

/*
 * 写一个简单的计算器
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * 面向过程的实现方式
		 */
		//1、接收控制台输入
		System.out.println("---计算器程序---");
		System.out.println("---输入第一个操作数---");
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		
		System.out.println("---输入运算符---");
		String oper = scanner.nextLine();
		
		System.out.println("---输入第二个操作数---");
		String strNum2 = scanner.nextLine();
		//2、进行计算
		double result = 0;
		//if("+" == oper){
		if("+".equals(oper)){
			result = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);
		}else if("-".equals(oper)){
			result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
		}else if("*".equals(oper)){
			result = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
		}else if("/".equals(oper)){
			//如果为0，需要抛异常
			result = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}else{
			System.out.println("非法操作符");
			System.exit(0);
		}
		
		//3、返回结果
		System.out.println("---计算结果---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
		
	}
}
