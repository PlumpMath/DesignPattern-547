package _A_factory._404_TestFactory;

import java.util.Scanner;

/*
 * 写一个简单的计算器
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * 普通面向对象的实现方式：
		 * 1、需要明确指定需要实例化类
		 * 2、不利于扩展
		 * 
		 * 下面是使用简单工厂模式实现方式
		 * 这样添加其他操作，只需要增加相应的实现类并修改工厂类,符合开放-封闭原则中的开放原则，
		 * 但是，扩展时仍需要修改工厂类，所以不符合封闭原则
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
			
		scanner.close();
		
		//2、进行计算
		double result = 0;
		Operation operation = null;
		
		if ("+".equals(oper)) {
			OperationFactory addOpFactory = new AddOperationFactory();
			operation = addOpFactory.getOperatin();
		}else if("-".equals(oper)){
			OperationFactory subtractOpFactory = new SubtractOperationFactory();
			operation = subtractOpFactory.getOperatin();
		}else if("*".equals(oper)){
			OperationFactory multiplyOpFactory = new MultiplyOperationFacoty();
			operation = multiplyOpFactory.getOperatin();
		}else if("/".equals(oper)){
			OperationFactory dividOpFactory = new DividOperationFactory();
			operation = dividOpFactory.getOperatin();			
		}else{
			System.out.println("非法操作符");
		}
		operation.setNum1(num1);
		operation.setNum2(num2);
		result = operation.getResult();
				
			
		//3、返回结果
		System.out.println("---计算结果---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
			
	}
}
