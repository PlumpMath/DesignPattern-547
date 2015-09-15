package _A_Factory._402_TestFactory;

import java.util.Scanner;

/*
 * дһ���򵥵ļ�����
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * �������ʵ�ַ�ʽ��
		 * 1��������ȫ�����������ƣ�ȱ�ٴ�������
		 * 2����������չ
		 * 3��MainClass��Ҫ���������÷����������ҵ���߼���Ӧ�ó���������
		 * 
		 * ������ʹ���������ʵ�ַ�ʽ
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
		//�������ʵ����ӷ�����
		if("+".equals(oper)){
			operation = new AddOperation();
			//����ָ��ʵ�������࣬����ͨ������ģʽ
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
			System.out.println("�Ƿ�������");
			System.exit(0);
		}
			
		//3�����ؽ��
		System.out.println("---������---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
			
		scanner.close();
	}
}
