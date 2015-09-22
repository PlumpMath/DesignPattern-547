package _Q_Iterator._103_Iterator;

import java.util.Iterator;
import java.util.List;

/*
 * 迭代模式(Iterator)是行为模式之一，它把对容器中包含的内部对象的访问委让给外部类，使用Iterator(遍历)
 * 按顺序进行遍历访问的设计模式
 */

/*
 * 不使用迭代模式的应用：
 * 在应用Iterator模式之前，首先应该明白Iterator模式用来解决什么问题，或者说，如果不使用Iterator模式，
 * 会存在什么问题。
 * 1.由容器自己实现顺序遍历，直接在容器类里直接添加顺序遍历方法。
 * *2.让调用者自己实现遍历，直接爆漏数据细节给外部。
 */
public class MainClass {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010203","Java编程思想",90);
		Book book2 = new Book("010204","Java从入门到精通",60);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
//		while(bookList.hasNext()){
//			Book book = bookList.getNext();
//			book.display();
//		}
		
		/*
		//由调用者自己实现遍历
		List<Book> bookDataList = bookList.getList();
		for(int i = 0; i < bookDataList.size(); i++){
			Book book = bookDataList.get(i);
			book.display();
		}
		*/
		
		/*
		 * 不使用迭代模式的缺点
		 * 以上方法1与方法2都可以实现对象遍历，这样有什么问题呢？
		 * 1.容器类承担了太多功能：一方面需要提供添加删除等本身应用的功能，一方面还需要提供遍历访问功能。
		 * 2.往往容器在实现遍历的过程中，需要保存遍历状态，当跟元素的添加删除等功能夹杂在一起，很容易引起
		 * 混乱和程序运行错误等。
		 * 
		 * 
		 */
		
		Iterator<Book> iter = bookList.iterator();
		while(iter.hasNext()){
			Book book = iter.next();
			book.display();
		}
		
	}

}
