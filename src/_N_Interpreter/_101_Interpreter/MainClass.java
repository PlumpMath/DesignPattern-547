package _N_Interpreter._101_Interpreter;
/*
 * ������ģʽ��Interpreter������Ϊģʽ֮һ������һ����������ģʽ��������һ���������������ض�
 * �ļ��������������ԣ���������Ԥ�ȶ�����ķ����򵥵�˵��Interpreterģʽ��һ�ּ򵥵��﷨����
 * ���ܹ���
 */
public class MainClass {
	public static void main(String[] args){
		String number = "20";
		Context context = new Context(number);
		
		PlusExpression expression = new PlusExpression();
		expression.interpret(context);
		System.out.println(context.getOutput());
	}
}
