package _A_Factory._401_TestFactory;

import java.util.Scanner;

/*
 * дһ���򵥵ļ�����
 */
public class MainClass {
	public static void main(String[] args) {
		/*
		 * ������̵�ʵ�ַ�ʽ
		 */
		//1�����տ���̨����
		System.out.println("---����������---");
		System.out.println("---�����һ��������---");
		Scanner scanner = new Scanner(System.in);
		String strNum1 = scanner.nextLine();
		
		System.out.println("---���������---");
		String oper = scanner.nextLine();
		
		System.out.println("---����ڶ���������---");
		String strNum2 = scanner.nextLine();
		//2�����м���
		double result = 0;
		//if("+" == oper){
		if("+".equals(oper)){
			result = Double.parseDouble(strNum1) + Double.parseDouble(strNum2);
		}else if("-".equals(oper)){
			result = Double.parseDouble(strNum1) - Double.parseDouble(strNum2);
		}else if("*".equals(oper)){
			result = Double.parseDouble(strNum1) * Double.parseDouble(strNum2);
		}else if("/".equals(oper)){
			//���Ϊ0����Ҫ���쳣
			result = Double.parseDouble(strNum1) / Double.parseDouble(strNum2);
		}else{
			System.out.println("�Ƿ�������");
			System.exit(0);
		}
		
		//3�����ؽ��
		System.out.println("---������---");
		System.out.println(strNum1 + oper + strNum2 + "=" + result);
		
	}
}
