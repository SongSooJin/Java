package w4;

import java.util.Scanner;

/*
 * �μ��� �Է¹޾� ������ �Ҵ� �� , �μ� ������ ���� ���
 * a? 1
 * b? 10
 * a? 10
 * b? 1
 * 2 3 4 5 6 7 8 9 �� : xx
 * a,b�� ������ �Է½� ����
 * 
 */


public class Ex6_������_��_�ٲٱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.printf(" a? "); int a = sc.nextInt();
			System.out.printf(" b? "); int b = sc.nextInt();
			System.out.printf(" a: %d \t b:%d\n",a,b);
			if(a==b) break;
				int temp;
				if(a>b) {//10>1
					//���� �� �ٲٱ�
					 temp=a;
						a = b;
						b= temp;
				}
			System.out.printf(" a: %d \t b:%d\n",a,b);
			
			int hap=0; //���� ���ϴ� ������ �ʱ�ȭ 0
			
			for(int i=a+1; i<b;i++) {
				System.out.printf(" %d",i);
				hap += i;
			}//for
			
			System.out.printf(" ��: %d\n\n",hap);
		}//while
		System.out.println("����");
		sc.close();
	}

}
