package _Q_Iterator._103_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {
	private List<Book> bookList;
	private int index;//�жϱ�����ʲôλ��
	
	public BookList() {
		bookList = new ArrayList<>();
		index = 0;
	}


	//����鼮
	public void addBook(Book book){
		bookList.add(book);
	}
	
	//ɾ���鼮
	public void deleteBook(Book book){
		int bookIndex = bookList.indexOf(book);
		bookList.remove(bookIndex);
	}
	
	/*
	//���Ҫ��������Ҫ�ж��Ƿ�����һ����
	public boolean hasNext(){
		if(index >= bookList.size()){
			return false;
		}
		return true;
	}
	
	//�����һ������
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
	
	//������Iterator�ӿڵ�ʵ���࣬��Ϊ����Ҫʹ���ڲ��ı���(���������index)��������Ҫ����ʵ��Ϊ�ڲ���
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
