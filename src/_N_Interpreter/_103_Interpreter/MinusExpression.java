package _N_Interpreter._103_Interpreter;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		//提示信息
		System.out.println("自动递减");
		
		//获得上下文环境
		String input = context.getInput();
		//进行类型转换
		int intInput = Integer.parseInt(input);
		//进行递减
		--intInput;
		
		//对上下文环境重新进行赋值
		//将所得设置给Context的output
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
