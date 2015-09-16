package _N_Interpreter._102_Interpreter;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		//提示信息
		System.out.println("自动递增");
		
		//获得上下文环境
		String input = context.getInput();
		//进行类型转换
		int intInput = Integer.parseInt(input);
		//进行递增
		++intInput;
		
		//对上下文环境重新进行赋值
		//将所得设置给Context的output
		//需要保证input和output同步，这样下次输出是在当前输出的基础上进行相应的解释
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
