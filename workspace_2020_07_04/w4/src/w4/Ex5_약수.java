package w4;

import java.util.Scanner;

/*
 * ���� �Է¹޾� �Ҵ���, �׼��� �Ҽ������� �Ǻ��� ����϶�
 * ��? 6
 * 1 2 3 6 ����� ���� : x�� 
 * ...
 * ��? 1���� �������� �Է½� ����
 */

public class Ex5_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
	
	while(true) {
		System.out.printf("��? ");
		int su = sc.nextInt();
		
		if(su<1) break;
		int count=0; //����� ������ ���Һ����� �ʱⰪ 0

		for(int i=1;i<=su;i++) {
			if(su%i==0) {
			System.out.printf("��� : %d\n",i);
			count++; //++count; ==count=count+1; == count+=1;	
			}// if
		}//for
		
		System.out.printf("����� ���� : %d\n\n",count);
		}//while
		
		System.out.println("����");
		sc.close();
	
	}

}

/*
 * 6�� ���
 * 6%1==0  1(o)
 * 6%2==0  2(o)
 * 6%3==0  3(o)
 * 6%4!=0   4(x)
 * 6%5!=0   5(x)
 * 6%6==0  6(o)
 * 
 * 
 */