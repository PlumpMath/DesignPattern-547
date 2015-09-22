package _Q_Iterator._103_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
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
	
	/*
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
	*/
	
//	public List<Book> getList(){
//		return bookList;
//	}
	
	public Iterator iterator(){
		return new Itr();
	}
	
	//这里是Iterator接口的实现类，因为它需要使用内部的变量(比如这里的index)，所以需要将其实现为内部类
	private class Itr implements Iterator{

		@Override
		public boolean hasNext() {
			if(index >= bookList.size()){
				return false;
			}
			return true;
		}

		@Override
		public Object next() {
			return bookList.get(index++);
		}
		
	}
}
