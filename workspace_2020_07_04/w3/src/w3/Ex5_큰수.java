package w3;
/*
 * �μ� ? 100 1
 * ū�� : 100
 * �μ�? 1 999
 * ū�� : 999
 * ...
 * �μ�? 100 100 (�������� �Է½� ����)
 * �����մϴ�.
 */

import java.util.Scanner;

public class Ex5_ū�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int big;
		
		while(true) {
			System.out.println("�μ� ? ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a==b) break;
			big=(a>b)?a:b;
//				if(a>b)
//					big = a;
//				else 
//					big = b;
			System.out.printf("ū��: %d\n\n",big);
		}
		
		System.out.println("�����մϴ�.");
		sc.close();
		
		
		
	}

}
