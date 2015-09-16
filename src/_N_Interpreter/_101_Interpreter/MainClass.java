package _N_Interpreter._101_Interpreter;
/*
 * 解释器模式（Interpreter）是行为模式之一，它是一种特殊的设计模式，它建立一个解释器，对于特定
 * 的计算机程序设计语言，用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释
 * 器架构。
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
