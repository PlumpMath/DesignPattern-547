package _G_Observer._104_Observer;
/*
 * 模拟一个博客RSS系统
 */
public class MainClass {
	public static void main(String[] args) {
		BlogAdmin blogAdmin = new BlogAdmin(); 
		blogAdmin.addObserver(new MyObserver());
		blogAdmin.publishBlog("博客上线了", "欢迎来访问");
	}
}
