package w8;
/*
 * default ���������� : ������Ű�� �ȿ����� ���� (���ٰ���)
 */
import java.util.Scanner;

public class Ex2_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Book p[] = new Book[3];
		for(int i=0;i<p.length;i++) {
			System.out.printf("%d)\n",i+1);
			System.out.print("å ����?"); String title = sc.nextLine();
			System.out.print("å ����?"); String author = sc.nextLine();
			p[i]=new Book(title,author);
		}
		
		for(int i=0;i<p.length;i++) {
			//p[i].show();
			System.out.println("å ���� : "+p[i].title+ "\t����: " + p[i].author);
		}
		sc.close();
	}

}
