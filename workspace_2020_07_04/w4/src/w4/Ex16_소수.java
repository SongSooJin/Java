package w4;
/*
 * 수를 입력받아 할당후, 그수가 소수인지를 판별후 출력하라

  * 수? 13
 * 13: 소수임
 * 수? 11
 * ...
 * 수? 1보다 작은수의 입력시 종료
 */

import java.util.Scanner;

public class Ex16_소수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String pan = "@";
		
		while(true) {
			System.out.printf("수? ");
			int su = sc.nextInt();
			
			if(su<1) break;
			boolean sw=false; //나눠보기전 초기값
			int i;
			
			for(i=2;i<su;i++) { //2)1과 자신을 제외하고 나눠 봄 
				if(su%i==0) { sw=true;  break;}
			}//for
			
		 //pan=(sw == false && su != 1)?"소수":"소수아님";
			pan=(sw == false && i == su)?"소수":"소수아님";
				System.out.printf("%d : %s\n",su,pan);
			}//while
			
			System.out.println("종료");
			sc.close();
		

	}

}


/*
 * 소수 
1) 약수가 2개뿐인 수 
2) 1과 자신으로만 나눠지는 수
*/