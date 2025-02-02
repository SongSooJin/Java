package w10;
/*
 정수 3개를 입력하세요
0>>5
1>>R
정수가 아닙니다. 다시 입력하세요!
1>>4
2>>6
합은 15
 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex11_예외처리_예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0; i<3; i++) {
			System.out.print(i+"->>");
			try {
				n = sc.nextInt(); // 정수 입력
			}
			catch(InputMismatchException e) {
				//System.out.println(e); // java.util.InputMismatchException
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				sc.next(); // 입력 스트림에 있는 정수가 아닌 토큰을 버린다. 'R'을 버림 주의
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum);
		sc.close();


	}

}
