package w3;

import java.util.Scanner;

public class Ex4_���ǿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pan="@";
		
		while(true) {
			System.out.print("��? "); 
			int a = sc.nextInt();
			
			if(a<0) break;
				pan=(a%2==0)?"¦��":"Ȧ��";
			
//				if(a%2==0)  // ������ �켱���� : ���������>���迬����
//					pan="¦��";
//				
//				else 
//					pan="Ȧ��";		
				
				System.out.printf("%d : %s\n\n" , a,pan);
		}//while
		
		System.out.println("�����մϴ�.");
		sc.close();
		
		
	}

}

/*
 * ���ǿ�����(==���׿�����)
 * if~else�� ó������ ���� 1���϶��� ���ǿ����ڷ� ǥ���� ����
 * ����) 
 * (����)? �� : ����;
 *
 *
 */


