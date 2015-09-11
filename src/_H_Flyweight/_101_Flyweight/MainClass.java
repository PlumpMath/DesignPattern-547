package _H_Flyweight._101_Flyweight;

public class MainClass {

	public static void main(String[] args) {
		/*
		//��ʹ����Ԫģʽ�����ĸ
		MyCharacter myChar1 = new MyCharacter('a');
		MyCharacter myChar2 = new MyCharacter('b');
		MyCharacter myChar3 = new MyCharacter('a');
		MyCharacter myChar4 = new MyCharacter('d');
		
		myChar1.display();
		myChar2.display();
		myChar3.display();
		myChar4.display();
		
		//�ж�myChar1 == myChar3�Ƿ���ͬһ������
		if(myChar1 == myChar3){
			System.out.println("True!");
		} else{
			System.out.println("False!");
		}
		*/
		
		
		//��Ԫģʽ
		//1������MyCharacter����
		MyCharacterFactory factory = new MyCharacterFactory();
		
		//2���ӹ�����ȡ����Ӧ��MyCharacter
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
