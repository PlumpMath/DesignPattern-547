package _G_Observer._104_Observer;

import java.util.Observable;
/*
 * ���۲���
 */
public class BlogAdmin extends Observable {
	public void publishBlog(String title, String content){
		Article article = new Article();
		article.setArticleTitle(title);
		article.setArticleContent(content);
		
		System.out.println("�������������£����⣺" + title + ";���ݣ�" + content + "\n");
		this.setChanged();
		this.notifyObservers(article);
	}
}
