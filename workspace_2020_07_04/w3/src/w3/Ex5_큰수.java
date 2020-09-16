package w3;
/*
 * 두수 ? 100 1
 * 큰수 : 100
 * 두수? 1 999
 * 큰수 : 999
 * ...
 * 두수? 100 100 (같은수의 입력시 종료)
 * 종료합니다.
 */

import java.util.Scanner;

public class Ex5_큰수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int big;
		
		while(true) {
			System.out.println("두수 ? ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (a==b) break;
			big=(a>b)?a:b;
//				if(a>b)
//					big = a;
//				else 
//					big = b;
			System.out.printf("큰수: %d\n\n",big);
		}
		
		System.out.println("종료합니다.");
		sc.close();
		
		
		
	}

}
