package _G_Observer._104_Observer;

import java.util.Observable;
/*
 * 被观察者
 */
public class BlogAdmin extends Observable {
	public void publishBlog(String title, String content){
		Article article = new Article();
		article.setArticleTitle(title);
		article.setArticleContent(content);
		
		System.out.println("博主发表新文章，标题：" + title + ";内容：" + content + "\n");
		this.setChanged();
		this.notifyObservers(article);
	}
}
