package _G_Observer._104_Observer;

import java.util.Observable;
import java.util.Observer;
/*
 * 观察者
 */
public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("博主发表了新文章，快去看吧");
		
		Article article = (Article)arg;
		System.out.println("Blog Title:" + article.getArticleTitle());
		System.out.println("Blog Content:" + article.getArticleContent());
	}

}
