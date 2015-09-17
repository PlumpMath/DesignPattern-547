package _O_Mediator._101_Mediator;

public class Man extends Person{

	public Man(String name, int condition) {
		super(name, condition);
		
	}

	/*
	 * ����Man�еķ���������Woman�еķ���,��֮����ڽ�����Ϊ��ʹ��֮�����϶ȷǳ���
	 * ���һ�����еķ����ı�������һ����Ҳ��Ҫ�ı�
	 */
	@Override
	public void getPartner(Person person) {
		if (person instanceof Man) {
			System.out.println("�����Ҳ���ͬ����");
		}else {
			if(this.getCondition() == person.getCondition()){
				System.out.println(this.getName() + "��" + person.getName() + "����");
			}else{
				System.out.println(this.getName() + "��" + person.getName() + "������");
			}
		}
	}

}
