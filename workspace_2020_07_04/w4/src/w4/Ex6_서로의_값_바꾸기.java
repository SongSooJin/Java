package w4;

import java.util.Scanner;

/*
 * 두수를 입력받아 변수에 할당 후 , 두수 사이의 수를 출력
 * a? 1
 * b? 10
 * a? 10
 * b? 1
 * 2 3 4 5 6 7 8 9 합 : xx
 * a,b와 같은수 입력시 종료
 * 
 */


public class Ex6_서로의_값_바꾸기 {

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
					//서로 값 바꾸기
					 temp=a;
						a = b;
						b= temp;
				}
			System.out.printf(" a: %d \t b:%d\n",a,b);
			
			int hap=0; //합을 구하는 변수의 초기화 0
			
			for(int i=a+1; i<b;i++) {
				System.out.printf(" %d",i);
				hap += i;
			}//for
			
			System.out.printf(" 합: %d\n\n",hap);
		}//while
		System.out.println("종료");
		sc.close();
	}

}
