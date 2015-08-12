package _E_Decorator._101_Decorator;

public class Car {
	//跑
	public void run(){
		System.out.println("可以跑");
	}
	
	//随着科技的发展，有些车可能可以飞，可以游
	public void fly(){
		System.out.println("可以飞");
	}
	
	public void swim(){
		System.out.println("可以游");
	}
	
	/*
	 * 这样写显然是不太合适的，因为这样的Car不具有一般性，并不是对Car的抽象。
	 * 
	 * 该如何解决呢？
	 * 可以通过继承
	 */
	
	
	
	
	public void show(){
		System.out.println("拥有的功能：");
		this.run();
		this.fly();
		this.swim();
	}
	
}
