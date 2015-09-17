package _O_Mediator._103_Mediator;

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
		//将搭档设置上
		if(person instanceof Man){
			this.setMan((Man)person);
		}else{
			this.setWoman((Woman)person);
		}
		
		//判断条件
		if (man == null || woman == null) {//证明有重复设置
			System.out.println("汗！我不是同性恋");
		}else{
			if(man.getCondition() == woman.getCondition()){
				System.out.println(man.getName() + "和" + woman.getName() + "绝配");
			}else{
				System.out.println(man.getName() + "和" + woman.getName() + "不相配");
			}
		}
	}
}
