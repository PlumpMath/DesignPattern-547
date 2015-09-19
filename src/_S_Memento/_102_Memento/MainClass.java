package _S_Memento._102_Memento;
/*
 * 备忘录(Memento)模式，是行为模式之一，它的作用是保存对象的内部状态，并在需要的时候(undo/rollback)
 * 回复对象以前的状态。
 */
public class MainClass {

	public static void main(String[] args) {
		/*
		Person person = new Person("lisi","男",30);
		
		//保存内部状态
		Person backup = new Person();
		backup.setName(person.getName());
		backup.setSex(person.getSex());
		backup.setAge(person.getAge());
		
		person.display();
		
		//修改
		person.setAge(20);
		person.display();
		
		//回滚  还原
		backup.setName(backup.getName());
		backup.setSex(backup.getSex());
		backup.setAge(backup.getAge());
		person.display();
	
		//不适用备忘录模式时，状态的保存和恢复完全交给客户端，这是不合理的
		*/
		
		Person person = new Person("lisi","男",30);
		person.display();
		
		Memento memento = person.createMemento();
		
		person.setName("小芳");
		person.setSex("女");
		person.setAge(20);
		person.display();
		
		person.setMemento(memento);
		person.display();
		
		
	}

}
