package w3;

import java.util.Scanner;

/*
 * ���� �Է��Ͽ� ������ �Ҵ���, �� ���� ¦��(2�� ��� ==2�� �������� �������� 0)������ 
 * �Ǻ��Ͽ� �Ʒ���ó�� ���
 * ��? 10
 * 10 : ¦��
 * ��? 1
 * 1 : Ȧ��
 * ��? -111(������ �Է½� ����)
 * �����մϴ�.
 */
public class Ex3_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pan="@";
		
		while(true) {
			System.out.print("��? "); 
			int a = sc.nextInt();
			
			if(a<0) break;
				if(a%2==0)  // ������ �켱���� : ���������>���迬����
					pan="¦��";
				
				else 
					pan="Ȧ��";		
				
				System.out.printf("%d : %s\n\n" , a,pan);
		}//while
		
		System.out.println("�����մϴ�.");
		sc.close();
	}

}


/*
 * if~else
 * 
 * if(����)
 *{��1;��2;}
 * else
 * {����1;����2;}
 * ...
 * ������ �����ϸ� ���� ������, if~else������ ����
 * ������ �������� ������ else ������ ������ ����
 * 
 */
