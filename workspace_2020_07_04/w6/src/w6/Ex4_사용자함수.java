package w6;

import java.util.Scanner;

public class Ex4_������Լ� {
	
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
	
		System.out.printf("%d ���丮��: %d\n\n",n,factorial(n)); //call by value
		}
		
		System.out.println("����");
		sc.close();

	}

}
