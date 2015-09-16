package _N_Interpreter._103_Interpreter;

import java.util.ArrayList;
import java.util.List;

/*
 * 解释器模式（Interpreter）是行为模式之一，它是一种特殊的设计模式，它建立一个解释器，对于特定
 * 的计算机程序设计语言，用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释
 * 器架构。
 */
public class MainClass {
	public static void main(String[] args){
		String number = "20";
		Context context = new Context(number);
		/*
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
		*/
		List<Expression> list = new ArrayList<Expression>();
		list.add(new PlusExpression());
		list.add(new PlusExpression());
		list.add(new MinusExpression());
		
		for(Expression ex : list){
			ex.interpret(context);
			System.out.println(context.getOutput());
		}
	}
}
