package _N_Interpreter._102_Interpreter;
/*
 * ������ģʽ��Interpreter������Ϊģʽ֮һ������һ����������ģʽ��������һ���������������ض�
 * �ļ��������������ԣ���������Ԥ�ȶ�����ķ����򵥵�˵��Interpreterģʽ��һ�ּ򵥵��﷨����
 * ���ܹ���
 */
public class MainClass {
	public static void main(String[] args){
		String number = "20";
		Context context = new Context(number);
		
		PlusExpression expression1 = new PlusExpression();
		expression1.interpret(context);
		System.out.println(context.getOutput());
		
		PlusExpression expression2 = new PlusExpression();
		expression2.interpret(context);
		System.out.println(context.getOutput());
		
		PlusExpression expression3 = new PlusExpression();
		expression3.interpret(context);
		System.out.println(context.getOutput());
		
		MinusExpression minusExpression = new MinusExpression();
		minusExpression.interpret(context);
		System.out.println(context.getOutput());
	}
}
