package _O_Mediator._101_Mediator;

public class Man extends Person{

	public Man(String name, int condition) {
		super(name, condition);
		
	}

	/*
	 * 这里Man中的方法调用了Woman中的方法,类之间存在交互行为，使类之间的耦合度非常高
	 * 如果一个类中的方法改变了另外一个类也需要改变
	 */
	@Override
	public void getPartner(Person person) {
		if (person instanceof Man) {
			System.out.println("汗，我不是同性恋");
		}else {
			if(this.getCondition() == person.getCondition()){
				System.out.println(this.getName() + "和" + person.getName() + "绝配");
			}else{
				System.out.println(this.getName() + "和" + person.getName() + "不相配");
			}
		}
	}

}
