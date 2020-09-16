package w6;

import java.util.Scanner;

/*
 * ���� �Է¹޾� ������ �Ҵ���, �� ���� ���丮���� ������Լ����� ���ϰ�
 * ����� ������ main()���� ��
 * ��? 3
 * 3���丮�� : 6
 */

public class Ex3_������Լ� {

	static long factorial(int m) {
		//static �Լ���ȯ�ڷ��� �Լ���(�����μ��ڷ���1�Ű�����,�����μ��ڷ���2 �Ű�����)
		long f = 1L; //1(int), 1L(long)
		for(int i=1;i<=m;i++) {
			f*=i;
		}
		return f;
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("��? ");int n = sc.nextInt();
		
		if(n<0) break;
		long re = factorial(n); // ������Լ���(�����μ�1,�����μ�2);
		System.out.printf("%d ���丮��: %d\n",n,re);
		}
		
		System.out.println("����");
		sc.close();
	}

}


/*
 * ����� �Լ� : 
 * �ϳ��� pro.���� �����κ��� ó���� ������ ����ȴٸ� �������κ��� 
 * ������Լ����� �ۼ���, �ʿ��Ҷ� ȣ���Ͽ� ����
 * ������ ����, �о����� --> ����Ʈ���� ���꼺�� ������
 * ȣ���� �Լ���, ���ʹ� ȣ����ġ��
 * 
 * �Լ��� ȣ��
 * 1) call by value
 * 2) call by reference
 * 
 */