package w3;

import java.util.Scanner;

public class Ex4_조건연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pan="@";
		
		while(true) {
			System.out.print("수? "); 
			int a = sc.nextInt();
			
			if(a<0) break;
				pan=(a%2==0)?"짝수":"홀수";
			
//				if(a%2==0)  // 연산자 우선순위 : 산술연산자>관계연산자
//					pan="짝수";
//				
//				else 
//					pan="홀수";		
				
				System.out.printf("%d : %s\n\n" , a,pan);
		}//while
		
		System.out.println("종료합니다.");
		sc.close();
		
		
	}

}

/*
 * 조건연산자(==삼항연산자)
 * if~else의 처리문이 각각 1개일때는 조건연산자로 표현이 가능
 * 형식) 
 * (조건)? 참 : 거짓;
 *
 *
 */


