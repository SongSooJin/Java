package w8;

/*
 * default 접근지정자 : 같은패키지 안에서는 공개 (접근가능)
 * thie 생성자 
 * 같은 클래스의 다른 생성자 호출
 * 생성자 내에서만 사용 가능
 * 생성자 코드의 제일 처음에 있어야 함

 * 
 */

public class Book {
	
	String title; // 접근지정자 x --> default 접근지정자
	String author;
	void show() {System.out.println("책 제목 : "+title+ "\t저자: " + author);}


	public Book() {
		this("no_title","no_author");
		System.out.println("생성자 호출됌");
	}
	
	public Book(String title) {
		this(title,"작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title; this.author = author;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaBook = new Book("Java", "황기태");
		Book bible = new Book("Bible");
		Book emptyBook = new Book();
		javaBook.show();
		bible.show();
		emptyBook.show();
	}
	
}
