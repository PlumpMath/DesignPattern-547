package _N_Interpreter._102_Interpreter;

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
		//��Ҫ��֤input��outputͬ���������´�������ڵ�ǰ����Ļ����Ͻ�����Ӧ�Ľ���
		context.setInput(String.valueOf(intInput));
		context.setOutput(intInput);
	}

}
