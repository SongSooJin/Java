package w8;
/*
 * default 접근지정자 : 같은패키지 안에서는 공개 (접근가능)
 */
import java.util.Scanner;

public class Ex2_북 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Book p[] = new Book[3];
		for(int i=0;i<p.length;i++) {
			System.out.printf("%d)\n",i+1);
			System.out.print("책 제목?"); String title = sc.nextLine();
			System.out.print("책 저자?"); String author = sc.nextLine();
			p[i]=new Book(title,author);
		}
		
		for(int i=0;i<p.length;i++) {
			//p[i].show();
			System.out.println("책 제목 : "+p[i].title+ "\t저자: " + p[i].author);
		}
		sc.close();
	}

}
