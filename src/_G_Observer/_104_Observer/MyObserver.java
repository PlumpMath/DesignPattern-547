package _G_Observer._104_Observer;

import java.util.Observable;
import java.util.Observer;
/*
 * �۲���
 */
public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("���������������£���ȥ����");
		
		Article article = (Article)arg;
		System.out.println("Blog Title:" + article.getArticleTitle());
		System.out.println("Blog Content:" + article.getArticleContent());
	}

}
