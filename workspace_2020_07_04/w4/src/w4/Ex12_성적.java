package w4;

import java.util.Scanner;

/*
 * �̸�? ȫ �� ��
 * ����,����? 100 100
 * -----------------
 * �̸� : xxx
 * ��� : xxx   ��  : xxx
 * 
 *     ����Ͻðڽ��ϱ�?(Y/y/N/n) a
 *     ����Ͻðڽ��ϱ�?(Y/y/N/n) b
 *     ����Ͻðڽ��ϱ�?(Y/y/N/n) Y
 * �̸�? 
 * ...
 * ����Ͻðڽ��ϱ�?(Y/y/N/n) N 
 * �۾� ����
 *  
 */

public class Ex12_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);

		while(true) {
			System.out.printf("�̸�? ");
			String name = sc.nextLine();
			System.out.println("����, ����? ");
			int kor = tc.nextInt(); int eng = tc.nextInt();
			
			float avg = (float)(kor+eng)/2; //== (kor+eng)/2.0f;
			char grade='@';
			
				switch((int)avg/10) {
					case 10:
					case	 9:grade='A';break;
					case	 8:grade='B';break;
					case	 7:grade='C';break;
					case	 6:grade='D';break;
					default:grade='F';break;
				}//switch (��)
			
			System.out.println("---------------------------------");
			System.out.printf("�̸�: %s\n",name);
			System.out.printf("��� : %5.1f \t ��: %c\n\n",avg,grade);
			String ch = "@";
			
				do {
				System.out.print("����Ͻðڽ��ϱ�?(Y/y/N/n)");
				
				ch = tc.next().toLowerCase();
				}while(ch.equals("y") ==false && ch.equals("n")==false);
			if(ch.equals("n")) break;
			
			
		}//while
		System.out.println("����");
		sc.close();
		tc.close();
	}

}
