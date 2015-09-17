package _O_Mediator._102_Mediator;

public class Mediator {
	private Man man;
	private Woman woman;
	public void setMan(Man man) {
		this.man = man;
	}
	public void setWoman(Woman women) {
		this.woman = women;
	}
	
	public void getPartner(Person person){
		//���������
		if(person instanceof Man){
			this.setMan((Man)person);
		}else{
			this.setWoman((Woman)person);
		}
		
		//�ж�����
		if(man.getCondition() == woman.getCondition()){
			System.out.println(man.getName() + "��" + woman.getName() + "����");
		}else{
			System.out.println(man.getName() + "��" + woman.getName() + "������");
		}
	}
}
