package _N_Interpreter._101_Interpreter;

public class PlusExpression extends Expression {

	@Override
	public void interpret(Context context) {
		//��ʾ��Ϣ
		System.out.println("�Զ�����");
		
		//��������Ļ���
		String input = context.getInput();
		//��������ת��
		int intInput = Integer.parseInt(input);
		//���е���
		++intInput;
		
		//�������Ļ������½��и�ֵ
		//���������ø�Context��output
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
