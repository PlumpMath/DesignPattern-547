package _H_Flyweight._101_Flyweight;

//可以省略抽象享元角色直接创建具体享元角色
//具体享元角色
public class MyCharacter {
	private char myChar;

	public MyCharacter(char myChar) {
		this.myChar = myChar;
	}
	
	public void display(){
		System.out.println(myChar);
	}
	
	
}
