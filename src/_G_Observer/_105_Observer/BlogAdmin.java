package _G_Observer._105_Observer;

import java.util.Observable;

public class BlogAdmin extends Observable {
	public void publishBlog(String title, String content){
		System.out.println("�������������£����⣺" + title + ";���ݣ�" + content + "\n");
		this.setChanged();
		this.notifyObservers();
	}
}
