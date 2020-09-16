package w3;

import java.util.Scanner;

/*
 * 수를 입력하여 변수에 할당후, 그 수가 짝수(2의 배수 ==2로 나눴을때 나머지가 0)인지를 
 * 판별하여 아래문처럼 출력
 * 수? 10
 * 10 : 짝수
 * 수? 1
 * 1 : 홀수
 * 수? -111(음수의 입력시 종료)
 * 종료합니다.
 */
public class Ex3_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String pan="@";
		
		while(true) {
			System.out.print("수? "); 
			int a = sc.nextInt();
			
			if(a<0) break;
				if(a%2==0)  // 연산자 우선순위 : 산술연산자>관계연산자
					pan="짝수";
				
				else 
					pan="홀수";		
				
				System.out.printf("%d : %s\n\n" , a,pan);
		}//while
		
		System.out.println("종료합니다.");
		sc.close();
	}

}


/*
 * if~else
 * 
 * if(조건)
 *{참1;참2;}
 * else
 * {거짓1;거짓2;}
 * ...
 * 조건을 만족하면 참을 실행후, if~else다음문 실행
 * 조건을 만족하지 않으면 else 이하의 거짓을 실행
 * 
 */
