package w4;

/*
 * while���� �̿��Ͽ� ������ ���� �� �Է� �ް� ����� ����϶�.
 *	0�� �ԷµǸ� �Է��� �����Ѵ�.
 * 
 * ������ �Է��ϰ� �������� 0�� �Է��ϼ���.
 * 8
 *
 * 0
 * ���� ������ 1���̸� ����� 8.0�Դϴ�.

 */

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int count=0, n=0; 
		double sum=0.0; 

		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		
//		while(true) {
//			n = sc.nextInt();
//			if(n==0) break;
//			sum+=n;
//			count++;
//		}
		while((n = sc.nextInt()) != 0) { // 0�� �ԷµǸ� while �� ���
			sum = sum + n;
			count++;
		}
		System.out.print("���� ������ " + count + "���̸� ");
		System.out.println("����� " + sum/count + "�Դϴ�.");

		sc.close();
		
		
	}

}
