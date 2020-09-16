package w6;

import java.util.Scanner;

public class Ex4_사용자함수 {
	
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
	
		System.out.printf("%d 팩토리얼값: %d\n\n",n,factorial(n)); //call by value
		}
		
		System.out.println("종료");
		sc.close();

	}

}
