package _G_Observer._105_Observer;
/*
 * ģ��һ������RSSϵͳ
 */
public class MainClass {
	public static void main(String[] args) {
		BlogAdmin blogAdmin = new BlogAdmin(); 
		blogAdmin.addObserver(new MyObserver());
		blogAdmin.publishBlog("����������", "��ӭ������");
		
		/*
		 * ���۲�����֪ͨ�۲���ʱ�����Ը��۲��ߴ��ݶ���
		 */
	}
}