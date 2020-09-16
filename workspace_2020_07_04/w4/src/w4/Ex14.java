package w4;

/*
 * while문을 이용하여 정수를 여러 개 입력 받고 평균을 출력하라.
 *	0이 입력되면 입력을 종료한다.
 * 
 * 정수를 입력하고 마지막에 0을 입력하세요.
 * 8
 *
 * 0
 * 수의 개수는 1개이며 평균은 8.0입니다.

 */

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int count=0, n=0; 
		double sum=0.0; 

		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
//		while(true) {
//			n = sc.nextInt();
//			if(n==0) break;
//			sum+=n;
//			count++;
//		}
		while((n = sc.nextInt()) != 0) { // 0이 입력되면 while 문 벗어남
			sum = sum + n;
			count++;
		}
		System.out.print("수의 개수는 " + count + "개이며 ");
		System.out.println("평균은 " + sum/count + "입니다.");

		sc.close();
		
		
	}

}
