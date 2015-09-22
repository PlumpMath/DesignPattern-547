package _Q_Iterator._101_Iterator;
/*
 * 迭代模式(Iterator)是行为模式之一，它把对容器中包含的内部对象的访问委让给外部类，使用Iterator(遍历)
 * 按顺序进行遍历访问的设计模式
 */

/*
 * 不使用迭代模式的应用：
 * 在应用Iterator模式之前，首先应该明白Iterator模式用来解决什么问题，或者说，如果不使用Iterator模式，
 * 会存在什么问题。
 * *1.由容器自己实现顺序遍历，直接在容器类里直接添加顺序遍历方法。
 * 2.让调用者自己实现遍历，直接爆漏数据细节给外部。
 */
public class MainClass {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010203","Java编程思想",90);
		Book book2 = new Book("010204","Java从入门到精通",60);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
		while(bookList.hasNext()){
			Book book = bookList.getNext();
			book.display();
			
		}
	}

}
