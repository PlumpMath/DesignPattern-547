package _G_Observer._105_Observer;

import java.util.Observable;

public class BlogAdmin extends Observable {
	public void publishBlog(String title, String content){
		System.out.println("博主发表新文章，标题：" + title + ";内容：" + content + "\n");
		this.setChanged();
		this.notifyObservers();
	}
}
