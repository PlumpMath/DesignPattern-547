package _Q_Iterator._103_Iterator;

import java.util.Iterator;
import java.util.List;

/*
 * ����ģʽ(Iterator)����Ϊģʽ֮һ�����Ѷ������а������ڲ�����ķ���ί�ø��ⲿ�࣬ʹ��Iterator(����)
 * ��˳����б������ʵ����ģʽ
 */

/*
 * ��ʹ�õ���ģʽ��Ӧ�ã�
 * ��Ӧ��Iteratorģʽ֮ǰ������Ӧ������Iteratorģʽ�������ʲô���⣬����˵�������ʹ��Iteratorģʽ��
 * �����ʲô���⡣
 * 1.�������Լ�ʵ��˳�������ֱ������������ֱ�����˳�����������
 * *2.�õ������Լ�ʵ�ֱ�����ֱ�ӱ�©����ϸ�ڸ��ⲿ��
 */
public class MainClass {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010203","Java���˼��",90);
		Book book2 = new Book("010204","Java�����ŵ���ͨ",60);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
//		while(bookList.hasNext()){
//			Book book = bookList.getNext();
//			book.display();
//		}
		
		/*
		//�ɵ������Լ�ʵ�ֱ���
		List<Book> bookDataList = bookList.getList();
		for(int i = 0; i < bookDataList.size(); i++){
			Book book = bookDataList.get(i);
			book.display();
		}
		*/
		
		/*
		 * ��ʹ�õ���ģʽ��ȱ��
		 * ���Ϸ���1�뷽��2������ʵ�ֶ��������������ʲô�����أ�
		 * 1.������е���̫�๦�ܣ�һ������Ҫ�ṩ���ɾ���ȱ���Ӧ�õĹ��ܣ�һ���滹��Ҫ�ṩ�������ʹ��ܡ�
		 * 2.����������ʵ�ֱ����Ĺ����У���Ҫ�������״̬������Ԫ�ص����ɾ���ȹ��ܼ�����һ�𣬺���������
		 * ���Һͳ������д���ȡ�
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
