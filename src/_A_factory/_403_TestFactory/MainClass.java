package _A_factory._403_TestFactory;

import java.util.Scanner;

/*
 * дһ���򵥵ļ�����
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * ��ͨ��������ʵ�ַ�ʽ��
		 * 1����Ҫ��ȷָ����Ҫʵ������
		 * 2����������չ
		 * 
		 * ������ʹ�ü򵥹���ģʽʵ�ַ�ʽ
		 * �����������������ֻ��Ҫ������Ӧ��ʵ���ಢ�޸Ĺ�����,���Ͽ���-���ԭ���еĿ���ԭ��
		 * ���ǣ���չʱ����Ҫ�޸Ĺ����࣬���Բ����Ϸ��ԭ��
		 */
	
		System.out.println("---����������---");
		System.out.println("---�����һ��������---");
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
			
		System.out.println("---���������---");
		String oper = scanner.nextLine();
			
		System.out.println("---����ڶ���������---");
		String strNum2 = scanner.nextLine();
			
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
			
			
		//2�����м���
		double result = 0;
		Operation operation;
		
		operation = OperationFactory.getOperatin(oper);
		operation.setNum1(num1);
		operation.setNum2(num2);
		result = operation.getResult();
				
			
		//3�����ؽ��
		System.out.println("---������---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
			
	}
}
