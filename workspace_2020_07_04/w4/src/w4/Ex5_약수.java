package w4;

import java.util.Scanner;

/*
 * 수를 입력받아 할당후, 그수가 소수인지를 판별후 출력하라
 * 수? 6
 * 1 2 3 6 약수의 갯수 : x개 
 * ...
 * 수? 1보다 작은수의 입력시 종료
 */

public class Ex5_약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);	
	
	while(true) {
		System.out.printf("수? ");
		int su = sc.nextInt();
		
		if(su<1) break;
		int count=0; //약수의 갯수를 구할변수의 초기값 0

		for(int i=1;i<=su;i++) {
			if(su%i==0) {
			System.out.printf("약수 : %d\n",i);
			count++; //++count; ==count=count+1; == count+=1;	
			}// if
		}//for
		
		System.out.printf("약수의 갯수 : %d\n\n",count);
		}//while
		
		System.out.println("종료");
		sc.close();
	
	}

}

/*
 * 6의 약수
 * 6%1==0  1(o)
 * 6%2==0  2(o)
 * 6%3==0  3(o)
 * 6%4!=0   4(x)
 * 6%5!=0   5(x)
 * 6%6==0  6(o)
 * 
 * 
 */