package _Q_Iterator._101_Iterator;
/*
 * ����ģʽ(Iterator)����Ϊģʽ֮һ�����Ѷ������а������ڲ�����ķ���ί�ø��ⲿ�࣬ʹ��Iterator(����)
 * ��˳����б������ʵ����ģʽ
 */

/*
 * ��ʹ�õ���ģʽ��Ӧ�ã�
 * ��Ӧ��Iteratorģʽ֮ǰ������Ӧ������Iteratorģʽ�������ʲô���⣬����˵�������ʹ��Iteratorģʽ��
 * �����ʲô���⡣
 * *1.�������Լ�ʵ��˳�������ֱ������������ֱ�����˳�����������
 * 2.�õ������Լ�ʵ�ֱ�����ֱ�ӱ�©����ϸ�ڸ��ⲿ��
 */
public class MainClass {

	public static void main(String[] args) {
		BookList bookList = new BookList();
		
		Book book1 = new Book("010203","Java���˼��",90);
		Book book2 = new Book("010204","Java�����ŵ���ͨ",60);
		
		bookList.addBook(book1);
		bookList.addBook(book2);
		
		while(bookList.hasNext()){
			Book book = bookList.getNext();
			book.display();
			
		}
	}

}
