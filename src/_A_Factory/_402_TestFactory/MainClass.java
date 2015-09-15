package _A_Factory._402_TestFactory;

import java.util.Scanner;

/*
 * 写一个简单的计算器
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * 面向过程实现方式：
		 * 1、代码完全的面向过程设计，缺少代码重用
		 * 2、不利于扩展
		 * 3、MainClass主要是用来调用方法，集体的业务逻辑不应该出现在这里
		 * 
		 * 下面是使用面向对象实现方式
		 */
	
		System.out.println("---计算器程序---");
		System.out.println("---输入第一个操作数---");
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
			
		System.out.println("---输入运算符---");
		String oper = scanner.nextLine();
			
		System.out.println("---输入第二个操作数---");
		String strNum2 = scanner.nextLine();
			
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
			
			
		//2、进行计算
		double result = 0;
		Operation operation;
		//这里仅仅实现类加法操作
		if("+".equals(oper)){
			operation = new AddOperation();
			//必须指定实例化的类，可以通过工厂模式
			operation.setNum1(num1);
			operation.setNum2(num2);
			result = operation.getResult();
		}else if("-".equals(oper)){
			operation = new SubtractOperation();
			operation.setNum1(num1);
			operation.setNum2(num2);
			result = operation.getResult();
		}else if("*".equals(oper)){
			operation = new MultiplyOperation();
			operation.setNum1(num1);
			operation.setNum2(num2);
			result = operation.getResult();
		}else if("/".equals(oper)){
			operation = new DividOperation();
			operation.setNum1(num1);
			operation.setNum2(num2);
			result = operation.getResult();
		}else{
			System.out.println("非法操作符");
			System.exit(0);
		}
			
		//3、返回结果
		System.out.println("---计算结果---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
			
		scanner.close();
	}
}
