package w6;

import java.util.Scanner;

/*
 * 수를 입력받아 변수에 할당후, 그 수의 팩토리얼값은 사용자함수에서 구하고
 * 출력은 복귀후 main()에서 함
 * 수? 3
 * 3팩토리얼값 : 6
 */

public class Ex3_사용자함수 {

	static long factorial(int m) {
		//static 함수반환자료형 함수명(전달인수자료형1매개변수,전달인수자료형2 매개변수)
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
		System.out.print("수? ");int n = sc.nextInt();
		
		if(n<0) break;
		long re = factorial(n); // 사용자함수명(전달인수1,전달인수2);
		System.out.printf("%d 팩토리얼값: %d\n",n,re);
		}
		
		System.out.println("종료");
		sc.close();
	}

}


/*
 * 사용자 함수 : 
 * 하나의 pro.에서 일정부분의 처리가 여러번 진행된다면 그일정부분을 
 * 사용자함수에서 작성후, 필요할때 호출하여 실행
 * 수정이 용이, 분업가능 --> 소프트웨어 생산성이 높아짐
 * 호출은 함수형, 복귀는 호출위치로
 * 
 * 함수의 호출
 * 1) call by value
 * 2) call by reference
 * 
 */