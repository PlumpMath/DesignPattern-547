package _Q_Iterator._101_Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookList {
	private List<Book> bookList;
	private int index;//判断遍历到什么位置
	
	public BookList() {
		bookList = new ArrayList<>();
		index = 0;
	}


	//添加书籍
	public void addBook(Book book){
		bookList.add(book);
	}
	
	//删除书籍
	public void deleteBook(Book book){
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	
	//如果要遍历，需要判断是否有下一对象
	public boolean hasNext(){
		if(index >= bookList.size()){
			return false;
		}
		return true;
	}
	
	//获得下一个对象
	public Book getNext(){
		return bookList.get(index++);
	}
}
