package _H_Flyweight._101_Flyweight;

public class MainClass {

	public static void main(String[] args) {
		/*
		//不使用享元模式输出字母
		MyCharacter myChar1 = new MyCharacter('a');
		MyCharacter myChar2 = new MyCharacter('b');
		MyCharacter myChar3 = new MyCharacter('a');
		MyCharacter myChar4 = new MyCharacter('d');
		
		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();
		
		//判断myChar1 == myChar3是否是同一个对象
		if(myChar1 == myChar3){
			System.out.println("True!");
		} else{
			System.out.println("False!");
		}
		*/
		
		
		//享元模式
		//1、创建MyCharacter工厂
		MyCharacterFactory factory = new MyCharacterFactory();
		
		//2、从工厂中取出相应的MyCharacter
		MyCharacter myChar1 = factory.getMyCharacter('a');
		MyCharacter myChar2 = factory.getMyCharacter('b');
		MyCharacter myChar3 = factory.getMyCharacter('a');
		MyCharacter myChar4 = factory.getMyCharacter('d');
		
		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();
		
		if(myChar1 == myChar3){
			System.out.println("True!");
		} else{
			System.out.println("False!");
		}
	}

}
