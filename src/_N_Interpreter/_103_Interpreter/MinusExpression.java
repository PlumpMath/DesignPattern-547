package _N_Interpreter._103_Interpreter;

public class MinusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		//��ʾ��Ϣ
		System.out.println("�Զ��ݼ�");
		
		//��������Ļ���
		String input = context.getInput();
		//��������ת��
		int intInput = Integer.parseInt(input);
		//���еݼ�
		--intInput;
		
		//�������Ļ������½��и�ֵ
		//���������ø�Context��output
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
