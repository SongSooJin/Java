package w8;

/*
 * default ���������� : ������Ű�� �ȿ����� ���� (���ٰ���)
 * thie ������ 
 * ���� Ŭ������ �ٸ� ������ ȣ��
 * ������ �������� ��� ����
 * ������ �ڵ��� ���� ó���� �־�� ��

 * 
 */

public class Book {
	
	String title; // ���������� x --> default ����������
	String author;
	void show() {System.out.println("å ���� : "+title+ "\t����: " + author);}


	public Book() {
		this("no_title","no_author");
		System.out.println("������ ȣ���");
	}
	
	public Book(String title) {
		this(title,"���ڹ̻�");
	}
	
	public Book(String title, String author) {
		this.title = title; this.author = author;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaBook = new Book("Java", "Ȳ����");
		Book bible = new Book("Bible");
		Book emptyBook = new Book();
		javaBook.show();
		bible.show();
		emptyBook.show();
	}
	
}
