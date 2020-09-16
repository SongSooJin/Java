package w3;
/*
 * 월을 입력받고, 월에 해당하는 날수를 분류하고, 아래처럼 출력
 * 월? 5
 * 5월은 31일까지이다.
 * 월? 2
 * 2월은 28일까지이다.
 * ...
 * 월? 13
 * 	   월의 입력범위(1~12)오류...다시 월? 13
 * 	   월의 입력범위(1~12)오류...다시 월? -1
 * 	   월의 입력범위(1~12)오류...다시 월? 4
 * 4월은 30일까지이다.
 * 월? -999를 입력시
 * 종료
 * 
 */

import java.util.Scanner;

public class Ex8_날수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int days = 0;
		
		while(true) {
			System.out.print("월? ");
			int month = sc.nextInt();
			
			if(month==-999) break;
			//if(month<1 || month>12) {
			// 연산우선순위 : 관계연산자 > 논리연산자, 논리연산자 우선순위 : ! > &&> || 
			if( !(month>=1 && month<=12)){
				System.out.print("\t월의 입력범위(1~12)오류... 다시 ");
				continue;
			}
				if(month==2)
					days = 28;
				else if (month==4 || month==6 || month==9 || month==11)
					days = 30;
				else
					days = 31;
				
				System.out.printf("%2d월은 %d일 까지이다.\n\n",month,days);
		}//while
		
		System.out.println("종료");
		sc.close();
	}

}

/*
28일 : 2월
30일 : 4,6,9,11월
31일 : 1,3,5,7,8,10,12월
*/