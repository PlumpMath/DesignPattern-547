package _G_Observer._105_Observer;
/*
 * 模拟一个博客RSS系统
 */
public class MainClass {
	public static void main(String[] args) {
		BlogAdmin blogAdmin = new BlogAdmin(); 
		blogAdmin.addObserver(new MyObserver());
		blogAdmin.publishBlog("博客上线了", "欢迎来访问");
		
		/*
		 * 被观察者在通知观察者时，可以给观察者传递对象
		 */
	}
}
